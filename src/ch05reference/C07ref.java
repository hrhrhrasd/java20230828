package ch05reference;

public class C07ref {
	public static void main(String[] args) {
		String a = "java";
		String b = "spring";
		String c = a;
		
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
		
		System.out.println(code1); //a의 참조값
		System.out.println(code2); //b의 참조값
		System.out.println(code3); //c의 참조값 == a
	}
}
