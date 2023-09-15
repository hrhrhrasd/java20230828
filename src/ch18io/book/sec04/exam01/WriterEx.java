package ch18io.book.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("C:/Temp/testt.txt")) {

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("spring");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
