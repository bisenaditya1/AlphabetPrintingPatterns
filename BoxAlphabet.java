A  B  C  D  E  F  G  
A                 G  
A                 G  
A                 G  
A                 G  
A                 G  
A  B  C  D  E  F  G  


import java.util.Scanner;

public class AlphabeticPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of alphabets to print");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int alphabet = 65;
			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print((char) alphabet + "  ");
					alphabet++;
				}
			} else {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print((char) alphabet + "  ");
						alphabet++;

					} else {
						System.out.print("   ");
						alphabet++;
					}
				}
			}
			System.out.println();
		}

	}
}
