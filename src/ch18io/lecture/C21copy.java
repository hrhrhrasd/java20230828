package ch18io.lecture;

import java.io.*;

public class C21copy {
    public static void main(String[] args) {
        String src= "C:/Temp/asdasd.jpg";
        String des= "C:/Temp/asdasd_copy.jpg";
        String des2 = "C:/Temp/asdasd_copy2.jpg";

        long start = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des)) {

            byte[] b = new byte[1];
            int len = 0;

            while ((len = is.read(b)) != -1) {
                os.write(b,0,len);
            }

            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();


        long start2 = System.currentTimeMillis();
        try (InputStream is2 = new FileInputStream(src);
             BufferedInputStream is3 = new BufferedInputStream(is2);
             OutputStream os2 = new FileOutputStream(des2);
             BufferedOutputStream os3 = new BufferedOutputStream(os2)) {

            byte[] b = new byte[1];
            int len = 0;

            while ((len = is3.read(b)) != -1) {
                os3.write(b, 0, len);
            }

            os3.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end2 = System.currentTimeMillis();

        System.out.println(end-start);
        System.out.println(end2-start2);

    }
}
