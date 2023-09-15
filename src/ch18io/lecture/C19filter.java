package ch18io.lecture;

import java.io.*;

public class C19filter {
    public static void main(String[] args) {


        try (InputStream is = new FileInputStream("C:/Temp/out8.txt");
             InputStreamReader isw = new InputStreamReader(is);
        ) {

            System.out.println((char) isw.read());
            System.out.println((char) isw.read());
            System.out.println((char) isw.read());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
