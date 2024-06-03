
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class SAXExample {

    public static void main(String[] args) {
        try {
            // Create a SAXParserFactory instance
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // Obtain a SAXParser from the factory
            SAXParser saxParser = factory.newSAXParser();
            // Define the handler
            DefaultHandler handler = new DefaultHandler() {
                String currentElement = "";

        
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    currentElement = qName;
                    if (qName.equalsIgnoreCase("student")) {
                        String rollNo = attributes.getValue("rollno");
                        System.out.println("Current element: " + qName);
                        System.out.println("Roll Number: " + rollNo);
                    }
                }

      
                public void characters(char ch[], int start, int length) throws SAXException {
                    if (currentElement.equalsIgnoreCase("firstname")) {
                        System.out.println("First Name: " + new String(ch, start, length));
                    } else if (currentElement.equalsIgnoreCase("lastname")) {
                        System.out.println("Last Name: " + new String(ch, start, length));
                    } else if (currentElement.equalsIgnoreCase("nickname")) {
                        System.out.println("Nickname: " + new String(ch, start, length));
                    } else if (currentElement.equalsIgnoreCase("marks")) {
                        System.out.println("Marks: " + new String(ch, start, length));
                    }
                }

            
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if (currentElement.equalsIgnoreCase(qName)) {
                        currentElement = ""; // Clear current element
                    }
                }
            };

            // Parse the XML file
            saxParser.parse(new File("E:\\Netbeans\\Workspace\\TrinhThiThanhThao23IT252\\src\\GK.xml"), handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
