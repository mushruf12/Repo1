package poly;

public class CTpolymorphism {
	public int add () {
		int a=10;
		int b=20;
		return a+b;
	}
	public int add (int a ,int b) {
		
		return a+b;
	}
	
	public static void main(String args[]) {
		CTpolymorphism c1 = new CTpolymorphism();
		System.out.println(c1.add());
		System.out.println(c1.add(20,20));
	}
	

}
