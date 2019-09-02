import java.util.Scanner;


public class SumN {

	
	public static void main(String[] args) {
		
	
	
	int s=0,i=0;
	
	Scanner sc = new Scanner(System.in);
			
	System.out.println("Enter the number upto which the sum is to be obtained:");
	
	int n = sc.nextInt();

	sc.close();
	
	while(i<=n)
	{
		
		s = s+i;
		
		i++;
		
	}

 System.out.println("The sum of N numbers are as follows:");
 
 System.out.println(s);
	
	}

}



