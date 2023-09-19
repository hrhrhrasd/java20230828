package ch19network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C06server {
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(3000);
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
//                InputStream is = new FileInputStream("C:/Temp/out9.txt");
                BufferedInputStream bis = new BufferedInputStream(is);

                FileOutputStream fos = new FileOutputStream("C:/Temp/server.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)
        ) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            System.out.println("복사 완료");
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
