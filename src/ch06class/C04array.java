package ch06class;

public class C04array {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        System.out.println("a[0] = " + a[0]);
        
        a= method1();
        System.out.println("a[0] = " + a[0]);
    }
    
    public static int[] method1() {
        int[] k = {3,4,5};
        
        return k;
    }
    
}
