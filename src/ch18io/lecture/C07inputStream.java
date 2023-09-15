package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C07inputStream {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/out3.txt");) {

            int read1 = is.read();
            int read2 = is.read();
            int read3 = is.read();
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
