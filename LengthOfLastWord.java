
import java.util.Scanner;

public class LengthOfLastWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(findLength(input.nextLine()));
		input.close();
	}
	
	private static int findLength(String sentence){
		
		StringBuilder sb = new StringBuilder();
		char[] cha =sentence.toCharArray();
		for (char i : cha) {
			sb.append(i);
			if (i==' ') {
				sb.setLength(0);
			}
		}
		
		return sb.length();
		
	}
	

}
