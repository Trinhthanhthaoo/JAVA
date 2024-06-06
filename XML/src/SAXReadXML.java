import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class SAXReadXML {
    public static void main(String[] args) {
        try {
            File inputFile = new File("E:\\Netbeans\\Workspace\\BT_XML\\src\\Demo.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            MyHandler handler = new MyHandler();
            saxParser.parse(inputFile, handler);

            // Sort the main student list by name
            List<Student> studentList = handler.getStudentList();
            studentList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));

            // Print all students after sorting
            System.out.println("Danh sách sinh viên (đã sắp xếp theo tên):");
            for (Student student : studentList) {
                System.out.println(student.toString());
            }

            // Use Scanner to read user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID hoặc tên sinh viên để tìm kiếm: ");
            String searchInput = scanner.nextLine().trim();
            scanner.close();

            // Collect matching students
            List<Student> matchingStudents = new ArrayList<>();
            for (Student student : studentList) {
                if (student.getId().equalsIgnoreCase(searchInput) || student.getName().toLowerCase().contains(searchInput.toLowerCase())) {
                    matchingStudents.add(student);
                }
            }

            // Print sorted matching students
            if (matchingStudents.isEmpty()) {
                System.out.println("Không tìm thấy sinh viên với ID hoặc tên '" + searchInput + "'.");
            } else {
                System.out.println("Kết quả tìm kiếm:");
                for (Student student : matchingStudents) {
                    System.out.println(student.toString());
                }
            }

        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.err.println(e);
        }
    }
}
