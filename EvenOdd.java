import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		System.out.println(n);

		if (n % 2 == 0) {

			System.out.println("You have entered an even number");

		}

		else {

			System.out.println("You have entered an odd number");

		}

scn.close();	
	
	}

}
