package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("c:/Temp/out3.txt");){
            byte[] arr = {65, 66, 67, 68, 69};
            os.write(arr, 1, 3);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
