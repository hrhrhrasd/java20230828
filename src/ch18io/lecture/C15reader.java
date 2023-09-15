package ch18io.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {
    public static void main(String[] args) {
        //문자 단위 입력 스트림
        try (Reader reader = new FileReader("C:/Temp/out7.txt")) {

            char read1 = (char) reader.read();
            int read2 = reader.read();
            int read3 = reader.read();
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);

            char[] chars = new char[3];
            reader.read(chars);
            System.out.println(Arrays.toString(chars));
            reader.read(chars);
            System.out.println(Arrays.toString(chars));
            reader.read(chars);
            System.out.println(Arrays.toString(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
