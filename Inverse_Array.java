package Classes_7sep_8sep_2019;

import java.util.*;


public class Inverse_Array {

	static Scanner sc= new Scanner(System.in);
	
	public static void Inverse(int[] a,int n) {
		
		int[] b = new int[n]; 
		
		int i;
		
		for(i=0;i<n;i++) {
			
			b[a[i]] = i;
			
		}
	
	System.out.println("The inversed array is :");	
	
	for(i=0;i<n;i++) {
			System.out.println(b[i]);
			
			
		}
	}	
	
	public static void main(String[] args) {
		
		int n,i;
		
		System.out.println("Enter the size of the array:");
		
		n = sc.nextInt();
		
		int[] a = new int[n];
	
		System.out.println("Enter the array elements:");
		
		for(i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
			
		}
	
		Inverse(a,n);
	
	}

}
