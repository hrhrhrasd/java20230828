package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03tryWithResource {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(112);
            os.write(113);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //try-with-resource 문법
    public void mothod2() {
        try (OutputStream os = new FileOutputStream("");) {
            os.write(33);
            os.write(35);
            os.write(36);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method3() {
        try (FileOutputStream fos = new FileOutputStream("");
             FileInputStream fis = new FileInputStream("")
        ) {
            fos.write(234);
            fis.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void method4() {
        Scanner scanner = new Scanner("");
        try (scanner){
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5() {
        try {
            FileOutputStream fos = new FileOutputStream("");
            FileInputStream fis = new FileInputStream("");

            try (fos; fis) {
                fos.write(33);
                fis.read();
            } catch (IOException e) {
                throw new RuntimeException();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void method6() throws IOException {
        // 안좋은 코드임...
        //exception 발생시 close 안하고 호출한곳으로 돌아감

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}



















