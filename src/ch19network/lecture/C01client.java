package ch19network.lecture;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class C01client {
    public static void main(String[] args) {
        try (
                Socket soket = new Socket("172.30.1.19",3500);
                Writer writer = new OutputStreamWriter(soket.getOutputStream());
                BufferedWriter bw = new BufferedWriter(writer)
        ) {
            bw.write("hello");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
