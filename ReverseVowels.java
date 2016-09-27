
import java.util.Scanner;

public class ReverseVowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		reverseVowels(input.next());
		input.close();
	}

	private static void reverseVowels(String sentence) {
		char a;
		char[] ch = sentence.toCharArray();
		int b = ch.length - 1;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				for (int m = b; m >= i; m--) {
					if (ch[m] == 'a' || ch[m] == 'e' || ch[m] == 'i' || ch[m] == 'o' || ch[m] == 'u') {
						a = ch[i];
						ch[i] = ch[m];
						ch[m] = a;
						b = m - 1;
						break;
					}
				}
			}
		}
		System.out.println(ch);

	}

}
