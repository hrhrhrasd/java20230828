package ch19network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C05client {
    //client 가 sever에게 파일 보내기
    public static void main(String[] args) {

        String path = "C:/Temp/asdasd.jpg";
        try (
                Socket socket = new Socket("172.30.1.19", 3000);
                FileInputStream fi = new FileInputStream(path);
                BufferedInputStream bis = new BufferedInputStream(fi);

                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] bytes = new byte[1024];
            int len =0;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
