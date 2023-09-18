package ch18io.lecture;

import java.io.File;
import java.util.Date;

public class C28file {
    public static void main(String[] args) {
        // java.io.File

        String path = "src/ch18io/lecture/C28file.java";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("new Date(file.lastModified()) = " + new Date(file.lastModified()));
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
    }
}
