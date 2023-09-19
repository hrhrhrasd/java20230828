package ch19network.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class C04server {
    public static void main(String[] args) {
        try (
                ServerSocket socket = new ServerSocket(3500);
                Socket socket1 = socket.accept();
                OutputStream os = socket1.getOutputStream();
                Writer writer = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(writer);
        ) {
                bw.write("hello client");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
