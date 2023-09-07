package ch15collection.book.sec02.exam01;

import ch07extends.book.sec06.pack1.B;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "저자1"));
        list.add(new Board("제목2", "내용2", "저자2"));
        list.add(new Board("제목3", "내용3", "저자3"));
        list.add(new Board("제목4", "내용4", "저자4"));
        list.add(new Board("제목5", "내용5", "저자5"));
        list.add(new Board("제목6", "내용6", "저자6"));

        System.out.println("총 객체수 : "+list.size());
        System.out.println();

        Board board = list.get(2);
        System.out.println("특정 객체 가져오기 : "+board.getSubject()+"\t"+
                board.getContent() +"\t"+board.getWriter());

        for (int i=0; i < list.size();i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject()+"\t"+
                    b.getContent() +"\t"+b.getWriter());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject()+"\t"+
                    b.getContent() +"\t"+b.getWriter());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        list.forEach(b -> System.out.println(b.getSubject()+"\t"+
                b.getContent() +"\t"+b.getWriter()));
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