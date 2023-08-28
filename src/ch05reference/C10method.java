package ch05reference;

public class C10method {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a));
		
		System.out.println(a[0]);
		method1(a);
		
		System.out.println("메소드 호출후");
		System.out.println(a[0]);
	}
	
	private static void method1(int[] x) {
		System.out.println("method1 메소드");
		System.out.println(System.identityHashCode(x));
		System.out.println(x[0]);
		
		x[0] = 33;
	}
}
