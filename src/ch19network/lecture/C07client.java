package ch19network.lecture;

import java.io.*;
import java.net.Socket;

public class C07client {
    public static void main(String[] args) {
        //서버가 클라이언트에게 파일 보내기
        try (
                Socket socket = new Socket("172.30.1.19", 3000);
                InputStream is = socket.getInputStream();
                BufferedInputStream bi = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("C:/Temp/server2.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] bytes = new byte[1024];
            int len=0;
            while ((len =bi.read(bytes)) != -1) {
                bos.write(bytes,0,len);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
