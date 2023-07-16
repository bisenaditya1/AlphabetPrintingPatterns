*    *
*    *
*    *
*    *
*    *
******

import java.util.Scanner;

public class UPatternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");

		int n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			if (i < n) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println();
			}
			else if (i==n){
				for (int j = 1; j <= n; j++)
					System.out.print("*");

			}

		}
	}
}

