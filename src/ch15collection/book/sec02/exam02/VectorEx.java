package ch15collection.book.sec02.exam02;



import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                list.add(new Board("제목"+i,"내용"+i,"저자"+i));
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 1001; i <= 2000; i++) {
                list.add(new Board("제목"+i,"내용"+i,"저자"+i));
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int size = list.size();
        System.out.println("size = " + size);
        System.out.println();

        }
}

class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }
}