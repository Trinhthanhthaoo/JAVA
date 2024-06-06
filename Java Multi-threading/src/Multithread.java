import java.io.*;
import java.util.Scanner;

class Test {
    synchronized void test_function(int n)
    {
        for (int i = 1; i <= 3; i++) {
            System.out.println(n + i);
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithread {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();
       
        final Test obj = new Test();

        Thread a = new Thread() {
            public void run() { obj.test_function(1); }
        };

        Thread b = new Thread() {
            public void run() { obj.test_function(30); }
        };

        a.start();
        b.start();
    }
}
