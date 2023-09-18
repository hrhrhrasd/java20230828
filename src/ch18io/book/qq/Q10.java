package ch18io.book.qq;

import java.io.*;

public class Q10 {
    public static void main(String[] args) {

            InputStream key = System.in;
            InputStreamReader isr = new InputStreamReader(key);
            BufferedReader br = new BufferedReader(isr);

            try (isr; br) {
                System.out.print("원본 파일 경로 입력 > ");
                String main = br.readLine();
                File file = new File(main);

                System.out.print("복사 파일 경로 입력 > ");
                String copy = br.readLine();
                File file2 = new File(copy);
                File file3 = new File(file2.getParent());
                if (file.exists()) {
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }


                    try (InputStream is = new FileInputStream(main);
                         OutputStream os = new FileOutputStream(copy)) {

                        byte[] b = new byte[1024];
                        int len = 0;

                        while ((len = is.read(b)) != -1) {
                            os.write(b, 0, len);
                        }

                        os.flush();
                        System.out.println("복사 성공");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("원본 파일이 존재하지 않습니다");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
