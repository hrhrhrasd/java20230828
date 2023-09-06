package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = i;
        Object k = j;

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7;

        Integer q = (Integer) o;    //위험
        int r = q;

        int s = 30;
        long t = s;

        Integer u = 300;
//        Long v = u;       //불가 (다형성)
    }
}
