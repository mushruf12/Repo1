package com;

public class Palindrome {
	public boolean palindrome(int a) {
		int temp,new_Value=0,n=a;
		while(a>0) {
			temp=a%10;
			new_Value=(new_Value*10)+temp;
			a=a/10;
			
		}
		if(n==new_Value) {
			return true;
		}
		else {
			return false;
		}
	}

}
