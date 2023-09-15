package ch18io.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        //outputstream과 writer 비교
        String file1 = "C:/Temp/out5.txt";
        String file2 = "C:/Temp/out6.txt";

        try (OutputStream os = new FileOutputStream(file1);
             Writer writer = new FileWriter(file2)) {

            os.write(65);
            writer.write(65);

            os.write(48124);        //? 출력
            writer.write(48124);    //민 출력


            os.flush();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
