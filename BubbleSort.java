package Classes_7sep_8sep_2019;

import java.util.*;

public class BubbleSort {


	static Scanner sc = new Scanner(System.in);
	
	public static void Sort(int[] a , int n) {
		
		int j,i;
		
		for(i=0;i<n-1;i++) {
			
			for(j=0;j<n-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					
					a[j] = a[j+1];
					
					a[j+1] = temp;
				
				}
				
			}
			
		}
		
		System.out.println("The sorted array elements are:");
		
		for(i=0;i<n;i++) {
			
			System.out.println(a[i]);
			
		}
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		int n,i;
		
		System.out.println("Enter the size of the array:");
		
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		
		System.out.println("Enter the list of elements:");
		
		
		for(i=0;i<n;i++) {
			
			
			a[i] = sc.nextInt();
			
			
		}
	
		Sort(a,n);
	
	}


}
