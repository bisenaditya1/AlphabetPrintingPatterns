          A 
         A B 
        A B C 
       A B C D 
      A B C D E 
     A B C D E F 
    A B C D E F G 

import java.util.Scanner;

public class TriangleCharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th number of lines :");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) {
			int alphabet= 65;
			for( int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for( int j=1; j<=i; j++) {
				System.out.print((char)alphabet++ + " ");
			}
			System.out.println();
		}
	}

}
