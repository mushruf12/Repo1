package collectiospackage;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number - ");
		int a=sc.nextInt();
		System.out.println("Enter first number - ");
		int b =sc.nextInt();
		System.out.println("Enter first number - ");
		int c=sc.nextInt();
		int d = a+b+c;
		System.out.println(d);
		sc.close();

	}

}
