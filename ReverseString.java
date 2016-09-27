
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Please enter a sentence.");
		Scanner input = new Scanner(System.in);
		reverseString(input.nextLine());
		input.close();

	}

	private static void reverseString(String sentence) {
		List<String> words = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		char[] cha = sentence.toCharArray();

		for (char a : cha) {
			if (a != ' ') {
				sb.append(a);
			} else if (a == ' ') {
				words.add(String.valueOf(sb));
				sb.setLength(0);
			}
		}
		words.add(String.valueOf(sb));

		for (int m = (words.size() - 1); m >= 0; m--) {
			System.out.print(words.get(m) + " ");
		}
	}

}
