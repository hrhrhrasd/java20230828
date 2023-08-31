package ch08interface.book.QQ.Q07;

public class DaoEx {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}


interface DataAccessObject {
    void select();
    void insert();
    void update();
    void delete();
}

class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("OracleDB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("OracleDB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("OracleDB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("OracleDB에서 삭제");
    }
}

class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("MySqlDB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySqlDB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySqlDB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySqlDB에서 삭제");
    }
}
