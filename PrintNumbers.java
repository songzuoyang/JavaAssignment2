
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		printNumbers(input.nextInt());
		input.close();
	}

	private static void printNumbers(int number) {

		int a = -1;
		int b = -2;
		List<Integer> numbers = new ArrayList<Integer>();

		if (number % 2 != 0) {
			for (int i = 1; i <= number; i++) {
				a = a + 2;
				numbers.add(a);
			}
		} else if (number % 2 == 0) {
			for (int i = 1; i <= number; i++) {
				b = b + 2;
				numbers.add(b);
			}
		}
		for (int c : numbers) {
			System.out.print(c + " ");
		}
	}

}
