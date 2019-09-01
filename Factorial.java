import java.util.Scanner;


public class Factorial {

public static void main(String[] args) {
	
	int i,a;
	
	Scanner scn = new Scanner(System.in);
	
	a = scn.nextInt();
			
	for(i=a-1;i>=1;i--)
	{
		
		a=a*i; 
	}

	System.out.println(a);


scn.close();
}



}
