A	B	C	D	E	
A	B	C	D	
A	B	C	
A	B	
A	
A	B	
A	B	C	
A	B	C	D	
A	B	C	D	E

import java.util.Scanner;

public class KPatternAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an odd number: ");
		int n = sc.nextInt();

		// int alphabet = 97;

		for (int i = 1; i <= n / 2 + 1; i++) {
			int alphabet = 65;

			for (int j = i; j <= n / 2 + 2 - 1; j++) {
				System.out.print((char) alphabet++ + "\t");
			}

			System.out.println();
		}
		for (int i = n / 2 + 2; i <= n; i++) {
			int alphabet = 65;
			for (int j = 2; j <= i - n / 2 + 1; j++) {
				System.out.print((char) alphabet++ + "\t");
			}
			System.out.println();
		}

	}

}
