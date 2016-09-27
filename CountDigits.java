
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println("Please enter a number.");
		Scanner input = new Scanner(System.in);
		System.out.println(countDigits(input.nextInt()));
		input.close();

	}

	private static int countDigits(int number) {
		int a = 0;
		String s = String.valueOf(number);
		a = number % s.length();

		return a;
	}

}
