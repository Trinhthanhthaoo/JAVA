import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

public class MyHandler extends DefaultHandler {
    private List<Student> studentList = null;
    private Student student = null;
    private StringBuilder data = null;

    public List<Student> getStudentList() {
        return studentList;
    }

    // This method is called at the start of an element
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            String id = attributes.getValue("id");
            student = new Student(id, "");
            if (studentList == null) {
                studentList = new ArrayList<>();
            }
        }
        data = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (student != null) {
            if (qName.equalsIgnoreCase("name")) {
                student.setName(data.toString());
            } else if (qName.equalsIgnoreCase("student")) {
                studentList.add(student);
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(new String(ch, start, length));
    }
}
