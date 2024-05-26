import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileExplorer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên thư mục và tên tệp tin
        System.out.print("Nhap ten thu muc: ");
        String directoryPath = scanner.nextLine();
        System.out.print("Nhap ten tep tin: ");
        String fileName = scanner.nextLine();
        scanner.close();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Thu muc khong hop le.");
            return;
        }

        List<String> result = new ArrayList<>();
        searchFiles(directory, fileName, result, "");

        System.out.println("Tong so tep tin tim duoc la: " + result.size());
        for (String path : result) {
            System.out.println(path);
        }
    }

    private static void searchFiles(File directory, String fileName, List<String> result, String indent) {
        File[] files = directory.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                result.add(indent + "|--" + file.getName());
                searchFiles(file, fileName, result, indent + "    ");
            } else if (file.getName().contains(fileName)) {
                result.add(indent + "|--" + file.getName());
            }
        }
    }
}
