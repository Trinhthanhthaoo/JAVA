package mid_term_examination_22git;

import java.io.File;
import java.util.Scanner;

public class ReadDirectory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên thư mục: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            displayDirectoryTree(directory, "", true);
        } else {
            System.out.println("Thư mục không tồn tại hoặc không phải là thư mục hợp lệ.");
        }
    }

    private static void displayDirectoryTree(File dir, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└── ");
            indent += "    ";
        } else {
            System.out.print("├── ");
            indent += "│   ";
        }
        System.out.println(dir.getName() + " (" + getDirectorySize(dir) + " bytes)");

        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                boolean last = (i == files.length - 1);
                if (files[i].isDirectory()) {
                    displayDirectoryTree(files[i], indent, last);
                } else {
                    displayFile(files[i], indent, last);
                }
            }
        }
    }

    private static void displayFile(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└── ");
        } else {
            System.out.print("├── ");
        }
        System.out.println(file.getName() + " (" + file.length() + " bytes)");
    }

    private static long getDirectorySize(File dir) {
        long size = 0;
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += getDirectorySize(file);
                }
            }
        }
        return size;
    }
}


