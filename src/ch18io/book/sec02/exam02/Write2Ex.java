package ch18io.book.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write2Ex {
    public static void main(String[] args) {

        try (OutputStream os = new FileOutputStream("c:/Temp/test2.db");){
            byte[] arr = {10, 20, 30};
            os.write(arr);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
