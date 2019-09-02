package pack24_25Aug2019;

import java.util.Scanner;

public class temperature {

		public static void main(String[] args) {
			
		int mint,maxt,step;

		Scanner scn = new Scanner(System.in);	
		
		System.out.println("Enter the minimum temperature:");
		
		mint = scn.nextInt();
		
		System.out.println("Enter the maximum temperature");
		
		maxt = scn.nextInt();
		
		System.out.println("Enter the step-size:");
		
		step = scn.nextInt();
		scn.close();
		
		System.out.println("The range of temperature conversions are as follows :");
		
		for(int i=mint;i<maxt;i=i+step)
		{
			
			System.out.println(i);
			
			System.out.println((1.8)*i + 32);
			
		}
		
		
		
		}	
		
				
}
