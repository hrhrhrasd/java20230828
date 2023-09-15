package ch18io.book.sec06;

import java.io.*;

public class CharacterConvertStreamEx {
    public static void main(String[] args) {
        write("문자 변환 스트림 사용");
        String data = read();
        System.out.println(data);
    }

    private static String read() {
        try (InputStream is = new FileInputStream("C:/Temp/test06.txt");
             Reader reader = new InputStreamReader(is, "UTF-8")) {

            char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data, 0, num);
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "데이터 읽기 실패";
    }

    public static void write(String str) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test06.txt");
             Writer writer = new OutputStreamWriter(os, "UTF-8")) {
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
