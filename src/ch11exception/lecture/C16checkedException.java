package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16checkedException {
    public static void main(String[] args) {
        try {
            var input = new FileInputStream("file");
            //checked exception은 예외처리코드 필수
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
