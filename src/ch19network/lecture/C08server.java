package ch19network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C08server {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(3000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ServerSocket finalServerSocket = serverSocket;
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try (
                        Socket socket = finalServerSocket.accept();
                        OutputStream os = socket.getOutputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(os);

                        InputStream is = new FileInputStream("C:/Temp/testp.jpg");
                        BufferedInputStream bis = new BufferedInputStream(is);
                ) {
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }
                    System.out.println("파일 보냄");
                    bos.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
