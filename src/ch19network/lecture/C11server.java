package ch19network.lecture;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C11server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080);) {

            while (true) {
                Socket accept = serverSocket.accept();

                Thread thread = new Thread(() -> {
                    try (
                            OutputStream outputStream = accept.getOutputStream();
                            PrintStream ps = new PrintStream(outputStream);
                    ) {

                        String html = """
                            <h1>~~~~~~~~~~~~~~~~~~~~~~~~</h1>
                            """;

                        ps.println("http/1.1 200");
                        ps.println("content-type: text/html; charset=utf-8");
                        ps.println("content-length: " + html.getBytes().length);
                        ps.println();
                        ps.println(html);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                thread.start();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
