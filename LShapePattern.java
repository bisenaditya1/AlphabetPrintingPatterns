*
*
*
*
* * * * * 


import java.util.Scanner;

public class LShapePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.println("*");
			}
			else if( i ==n) {
				for( int j=1 ; j<=n; j++) {
					System.out.print("* ");
				}
			}

		}
	}

}
