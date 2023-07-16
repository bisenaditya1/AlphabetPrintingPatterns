
A 
A B 
A B C 
A B C D 
A B C D E 

  import java.util.Scanner;

public class RightAlphabeticTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of alphabets :");
		int n = sc.nextInt();
		
		int alphabet =65;
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((char)(alphabet+ j) + " ");
			}
			System.out.println();
		}
		
	}

}
