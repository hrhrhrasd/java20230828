package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/out3.txt")) {
            byte[] arr = new byte[3];
            is.read(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            is.read(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            is.read(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            is.read(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            is.read(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
