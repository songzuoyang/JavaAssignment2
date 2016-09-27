
import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		findPascalsTriangle(input.nextInt());
		input.close();

	}

	private static void findPascalsTriangle(int n) {
		int[][] triangle = new int[n][2 * n - 1];
		triangle[0][n - 1] = 1;
		for (int a = 1; a < n; a++) {
			for (int b = 0; b < 2 * n - 1; b++) {
				if (b == 2 * n - 2) {
					triangle[a][b] = triangle[a - 1][b - 1];
				} else if (b == 0) {
					triangle[a][b] = triangle[a - 1][b + 1];

				} else {
					triangle[a][b] = triangle[a - 1][b - 1] + triangle[a - 1][b + 1];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int m = 0; m < 2 * n - 1; m++) {
				if (triangle[i][m] != 0) {
					System.out.print(triangle[i][m]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}
	}

}
