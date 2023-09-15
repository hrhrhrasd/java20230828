package ch18io.book.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write3Ex {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("c:/Temp/test3.db");){
            byte[] arr = {66, 67, 68, 69, 70};
            os.write(arr,1,3);
            os.write(20);
            os.write(arr,2,3);
            os.write(20);
            os.write(arr,1,4);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
