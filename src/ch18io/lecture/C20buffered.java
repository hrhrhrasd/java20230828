package ch18io.lecture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C20buffered {
    public static void main(String[] args) {
        String path = "C:/Temp/out9.txt";
        try (Writer writer = new FileWriter(path)) {

            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                writer.write('가');
            }
            long end = System.currentTimeMillis();
            System.out.println(end-start);

            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Writer writer2 = new FileWriter("C:/Temp/out10.txt");
             Writer writer3 = new BufferedWriter(writer2)) {

            long start2 = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                writer3.write('나');
            }
            long end2 = System.currentTimeMillis();
            System.out.println(end2-start2);

            writer3.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
