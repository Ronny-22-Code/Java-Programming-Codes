package pack24_25Aug2019;

import java.util.Scanner;

public class UpperLowerClass {
	
	
	public static void main(String[] args) {
		
	char a;
	
	Scanner scn = new Scanner(System.in);
	
	a = scn.next().charAt(0);
	
	
	if((a >= 'a') && (a <= 'z')){
		
		
		System.out.println("This is a lowercase letter entered by the user");
		
	}
	
	else if ((a>='A')&&(a<='Z'))
	{
		
		System.out.println("This is an uppercase letter entered by the user");
		
	}
	
	
	else {
		
			System.out.println("This is an invalid character entered by the user");
		
	}
	

 }

}