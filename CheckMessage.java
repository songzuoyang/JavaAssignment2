
import java.util.Scanner;

public class CheckMessage {
	public static void main(String[] args) {
		System.out.println("Please enter a number.");
		Scanner input = new Scanner(System.in);
		System.out.println(checkMessage(input.nextLine()));
		input.close();
	}

	private static int checkMessage(String message) {
		int count = 0;
		char[] cha = message.toCharArray();
		for (int i = 0; i < ((cha.length) / 3); i++) {
			if (cha[3 * i] != 'S') {
				count++;
			}
			if (cha[3 * i + 1] != 'O') {
				count++;
			}
			if (cha[3 * i + 2] != 'S') {
				count++;

			}
		}
		return count;

	}

}
