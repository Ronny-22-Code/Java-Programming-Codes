package java14_sep_15_sep_2019;

import java.util.*;

public final class Last_Index_Rec_Array {

	static Scanner sc = new Scanner(System.in);
	
	public static int lastIndex(int[]a,int n,int v,int i ) {
		
		if(i==n-1) {
			
			return -1;
			
		}
		int k = lastIndex(a,n,v,i+1);
		
		if(k==-1 && a[i]==v) {
			
			return i;
		}
		
		else {
			
			return k;
			
		}
	
	
	}
	
	
	public static void main(String[] args) {
		
		int n,i,v;
		
		
		System.out.println("Enter the size of the array");
	
		n = sc.nextInt();
	
		int[] a = new int[n];
	
		
		System.out.println("Enter the array elements:");
		
		for(i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter the value to find:");
	
		v = sc.nextInt(); 
	
		int f = lastIndex(a,n,v,0);
	
		System.out.println(f);
	
		
	}

}
