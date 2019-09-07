package Classes_7sep_8sep_2019;

import java.util.*;


public class Reverse_Array {

	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void Reverse(int n ,int[] a) {
		
		
		int i,temp;
		
		for(i=0;i<n;i++) {
			
			temp = a[i];
			
			a[i] = a[n-i-1];
			
			a[n-i-1] = temp;
			
		}
		
	System.out.println("The reversed array elements are:");	

		for(i=0;i<n;i++) {
			
			System.out.println(a[i]);
			
		}
	
	}
	
	
	public static void main(String[] args) {
		
		int n,i;
		
		
		System.out.println("Enter the size of the array:");
		
		n = sc.nextInt();
		
		System.out.println("Enter the array elements:");
		
		int[] a = new int[n];
		
		
		for(i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
		
		}
		
		
		Reverse(n,a);
	
	
	}




}


