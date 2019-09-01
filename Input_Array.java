package class31Aug_1Sep_2019;

import java.util.*;

public class Input_Array {


	static Scanner sc = new Scanner(System.in);
	
	public static void Input(int[] a,int n) {
		
		int i ;
		
		
		System.out.println("Enter the array elements:");
		
		for(i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
			
		}
		
	}
	
	
	public static void Display(int n ,int[] a) {
		
		int i ;
		
		
		for(i=0;i<n;i++) {
			
			System.out.println(a[i]);
		
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		int n;
		
		System.out.println("Enter the number of array elements:");
		
		n = sc.nextInt();
		
		int[] a = new int[n] ;
		
		Input(a,n);
		
		System.out.println("The Entered array elements by the user are:");
		
		Display(n,a);
		
		
		
	}


}
