package ch18io.lecture;

import java.io.*;

public class C11copy {
    public static void main(String[] args) {
        String src= "C:/Temp/testp.jpg";
        String des= "C:/Temp/testp_copy.jpg";

        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des)) {

            byte[] b = new byte[1024];
            int len = 0;

            while ((len = is.read(b)) != -1) {
                os.write(b,0,len);
            }

            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
