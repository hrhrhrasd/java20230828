package ch15collection.book.QQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q07 {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        for (Board b : list) {
            System.out.println(b.getTitle()+"-"+b.getContent());
        }

        System.out.println(list.contains(new Board("제목1", "내용1")));

        Board a = list.get(0);

        System.out.println(list.contains(a));
    }
}

class Board {
    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (!Objects.equals(title, board.title)) return false;
        return Objects.equals(content, board.content);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}

class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add (new Board("제목1", "내용1"));
        list.add (new Board("제목2", "내용2"));
        list.add (new Board("제목3", "내용3"));
        return  list;
    }
}