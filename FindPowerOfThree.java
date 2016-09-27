
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPowerOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		findPowerOfThree(input.nextInt());
		input.close();
	}

	private static void findPowerOfThree(int number) {
		List<Integer> powers = new ArrayList<Integer>();
		int power = 1;
		for (int i = 1; i < number; i++) {
			power = 3 * power;
			powers.add(power);
		}

		System.out.print("1 ");
		for (int a : powers) {
			System.out.print(a + " ");
		}

	}

}
