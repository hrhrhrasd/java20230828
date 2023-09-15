package ch18io.book.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReadEx {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("C:/Temp/test.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (Reader reader1 = new FileReader("C:/Temp/test.txt")) {
            int data;
            char[] arr = new char[100];
            while ((data = reader1.read(arr)) != -1) {
                for (int i = 0; i < data; i++) {
                    System.out.print(arr[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
