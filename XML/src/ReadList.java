import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.Scanner;

public class ReadList {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            File file = new File("E:\\Netbeans\\Workspace\\BT_XML\\src\\Demo.xml");
            Document document = builder.parse(file);

            document.getDocumentElement().normalize();

            NodeList studentList = document.getElementsByTagName("student");

            System.out.println("Number of students: " + studentList.getLength());

            for (int i = 0; i < studentList.getLength(); i++) {
                Node student = studentList.item(i);

                if (student.getNodeType() == Node.ELEMENT_NODE) {
                    Element studentElement = (Element) student;
                    String id = studentElement.getAttribute("id");
                    String name = studentElement.getElementsByTagName("name").item(0).getTextContent();
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println();
                }
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID: ");
            String searchId = scanner.nextLine();
            scanner.close();

            boolean studentFound = false;

            for (int i = 0; i < studentList.getLength(); i++) {
                Node student = studentList.item(i);

                if (student.getNodeType() == Node.ELEMENT_NODE) {
                    Element studentElement = (Element) student;
                    String id = studentElement.getAttribute("id");

                    if (id.equals(searchId)) {
                        String name = studentElement.getElementsByTagName("name").item(0).getTextContent();

                        System.out.println("Search Result:");
                        System.out.println("ID: " + id);
                        System.out.println("Name: " + name);
                        studentFound = true;
                        break; // Exit loop once the student is found
                    }
                }
            }

            if (!studentFound) {
                System.out.println("Student with ID " + searchId + " not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}