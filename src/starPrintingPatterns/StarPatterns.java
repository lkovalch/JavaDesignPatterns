package starPrintingPatterns;

import java.util.Scanner;

public class StarPatterns {
	
	// EXAMPLE OF THIS CODE PATTERN 
	// *****
	// *****
	// *****
	// *****

	public static void main(String[] args) {
		
		//User inputs how many rows/lines will be the pattern

		System.out.println("Enter no of lines:");
		
		Scanner scanner = new Scanner (System.in);
		
		int no = scanner.nextInt();
		
		int j, i; // i- number of lines; j- number of colums, number of stars on 1 line
		
		//First (outer) loop identifies number of lines.
		//Last print statement has empty (), means just start from new line  
		for (i=0; i<=no; i++ ) {
			
			
		//second inside loops tells how many symbols will be on the row
		for (j=0; j<=3; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			}
		scanner.close(); //Close scanner so no more inputs from user possible
		
	}
	
  
}
