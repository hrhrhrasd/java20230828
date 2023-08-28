package ch05reference;

public class C03ref {
	public static void main(String[] args) {
		int[] c = {3,4,5};
		int[] d = c;
		
		c[2] = 55;
		
		System.out.println(c[2]); //55
		System.out.println(d[2]); //55
 	}
}
