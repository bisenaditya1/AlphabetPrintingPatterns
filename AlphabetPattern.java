A
BB
CCC
DDDD
EEEEE

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines");
		int n = sc.nextInt();
		int alphabet = 65;
		int i,j;
		for ( i=1; i<=n; i++) {
			for( j=1; j<=i; j++) {
				System.out.print((char)alphabet);
			}
			alphabet++;
			System.out.println();
		}
	}

}
