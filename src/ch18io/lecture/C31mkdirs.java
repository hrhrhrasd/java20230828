package ch18io.lecture;

import java.io.File;

public class C31mkdirs {
    public static void main(String[] args) {
        //여러 디렉토리 한번에 만들기
        File file = new File("C:/Temp/test1/test2/test3");
        System.out.println("file.exists() = " + file.exists());
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
