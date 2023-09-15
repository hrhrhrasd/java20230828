package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;

public class C04outputStream {
    public static void main(String[] args) {
        String path = "C:\\Temp/out1.txt";

        try (FileOutputStream os = new FileOutputStream(path)){
            os.write(71);
            os.write(71);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
