package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);

            try (isr; br){

                String line = br.readLine();
                System.out.println("line = " + line);

                String line2 = br.readLine();
                System.out.println("line2 = " + line2);

                String line3 = br.readLine();
                System.out.println("line3 = " + line3);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
