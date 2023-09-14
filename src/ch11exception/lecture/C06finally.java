package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");
        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //exception 발생과 관계없이 실행되는 block
            System.out.println("code3");
        }
        System.out.println("codde4");
    }


}
