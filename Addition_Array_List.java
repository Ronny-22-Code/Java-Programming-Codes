package java14_sep_15_sep_2019;

import java.util.*;

public class Addition_Array_List {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int n,m,i;
		
		System.out.println("Enter the size of the first array:");
		
		n = sc.nextInt();
		
		System.out.println("Enter the size of the second array:");
	
		m = sc.nextInt();
	
		System.out.println("Enter the terms for the first array:");
		
		
		int[] a = new int[n];
		
		int[] b = new int[m];
		
		
		for(i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
			
		}
	
		
		System.out.println("Enter the terms for the second array:");
		
		for(i=0;i<m;i++) {
			
			b[i] = sc.nextInt();
			
		}
	
	
		Add(n,m,a,b);
	
	
	}

public static void Add(int n,int m,int[] a ,int[] b) {
	
	int i,j,r=0;
	
	ArrayList<Integer> list = new ArrayList<>();
	
	i=n-1;
	
	j=m-1;
	
	int c=0;
	
	while(i>=0 || j>=0) {
		
		int s=c;
		
		if(i>=0) {
		
		s = s+a[i];
		}
		
		if(j>=0) {
			s = s+b[j];
		}	
		
		r= s%10;
	
		c=s/10;
	
		list.add(0,r);
		
		i--;
		j--;
	
	}
	
	if(c>0) {
		
		list.add(0);
		
	}
	
		System.out.println(list);


	}

}
