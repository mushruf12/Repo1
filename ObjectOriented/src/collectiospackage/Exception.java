package collectiospackage;
import java.util.Scanner;
import java.io.*;
public class Exception {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		try (Scanner sc = new Scanner(System.in)){
			a=sc.nextInt();
			b=sc.nextInt();
			int c=a+b;
			System.out.println(c/0);
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		finally{
			System.out.println("Continue");
			
		}
	}

}
