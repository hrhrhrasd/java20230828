package ch18io.book.sec03.exam03;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        String src = "C:/Temp/test1.db";
        String des = "C:/Temp/test1_copy.db";

        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des)) {

            byte[] b = new byte[3];

            while (true) {
                int num = is.read(b);
                if(num==-1) break;
                os.write(b,0,num);
            }

            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
