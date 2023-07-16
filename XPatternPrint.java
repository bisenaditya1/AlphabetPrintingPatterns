*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *

import java.util.Scanner;

public class XPatternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int n = sc.nextInt();

		for (int i = -n; i <= n; i++) {
			for (int j = -n; j <= n; j++) {
				if (j == i || j == -i) {
					System.out.print("*");

				} else
					System.out.print(" ");

			}
			System.out.println();

		}
	}

}
