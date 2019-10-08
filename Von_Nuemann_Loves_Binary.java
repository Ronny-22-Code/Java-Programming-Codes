package java5thOct_6thOct_2019;

import java.util.*;

public class Von_Nuemann_Loves_Binary {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int i,rem,multiplier=1,ans=0,n;
		
		int d = scn.nextInt();
		
		for(i=0;i<d;i++){
		
		 n = scn.nextInt();
		 ans = 0;

		 multiplier = 1;

		while (n != 0) {

			 rem = n % 10;

			ans = rem * multiplier + ans;

			multiplier = multiplier * 2;
			n = n / 10;

		
		}
	System.out.println(ans);
	
	}
		

	}
}
	
	
	
	
	
	
	
	

