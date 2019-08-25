import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int i = 2;

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();

		int flag = 1;
		while (i <= a) {

			if (a % i == 0) {
				flag = 0;
				System.out.println("This is a composite number ");
				break;
			}

			i++;

		}

		if (flag == 1) {
			System.out.println("Prime");
		}

		scn.close();

	}

}
