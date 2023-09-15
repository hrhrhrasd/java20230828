package ch18io.lecture;

import java.io.*;

public class C16copy {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("C:\\Users\\admin2\\IdeaProjects\\java20230828\\src\\ch18io\\lecture\\C16copy.java");
             Writer writer = new FileWriter("C:/Temp/C16copy.java")) {

            char[] arr = new char[1000];
            int num;
            while ((num = reader.read(arr)) != -1) {
                    writer.write(arr,0,num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
