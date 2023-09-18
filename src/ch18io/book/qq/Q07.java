package ch18io.book.qq;

import java.io.*;

public class Q07 {
    public static void main(String[] args) {
        String filePath = "src/ch18io/book/qq/Q07.java";

        try (BufferedReader br = new BufferedReader(
                new FileReader(filePath))) {

            int rowNum = 0;
            String rowdata;
            while ((rowdata = br.readLine()) != null) {
                    rowNum++;
                    System.out.printf("%2d: %s%n", rowNum, rowdata);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}