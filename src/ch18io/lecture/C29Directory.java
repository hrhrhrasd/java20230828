package ch18io.lecture;

import java.io.File;

public class C29Directory {
    public static void main(String[] args) {
        String path = "C:/Temp";
        File file = new File(path);

        System.out.println("file.isDirectory() = " + file.isDirectory());
        //파일 목록 얻기
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
