package ch18io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C12writer {
    public static void main(String[] args) {
        String path = "C:/Temp/out4.txt";
        try (Writer writer = new FileWriter(path)) {
            writer.write('가');  //파라미터가 int >> char 이 int 로 자동 형 변환
            writer.write(48124);

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
