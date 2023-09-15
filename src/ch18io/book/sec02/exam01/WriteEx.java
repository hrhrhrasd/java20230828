package ch18io.book.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:\\Temp/test1.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;
            byte d = 77;

            os.write(a);
            os.write(b);
            os.write(c);
            os.write(d);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
