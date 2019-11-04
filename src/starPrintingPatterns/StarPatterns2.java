package starPrintingPatterns;

import java.util.Scanner;

public class StarPatterns2 {
	
	// EXAMPLE OF THIS CODE PATTERN 
	// *
	// **
	// ***
	// ****

	public static void main(String[] args) {
		
		//User inputs how many rows/lines will be the pattern

		System.out.println("Enter no of lines:");
		
		Scanner scanner = new Scanner (System.in);
		
		int numberOfLines = scanner.nextInt();
		int i, j; // i- number of lines/rows; j- number of colums, number of stars on 1 line
		
		//First (outer) loop identifies number of lines.
		//Last print statement has empty (), means just start from new line 
		
		scanner.close();
		
	if (numberOfLines < 20) {
	
		for (i=0; i<=numberOfLines; i++ ) {
		
		//second inside loops tells how many symbols will be on the row
		for (j=0; j<=i; j++) {
		System.out.print("*");
				
			}
			System.out.println();
			
		}}
	
	else if(numberOfLines >20)
		System.out.println("Too many lines! Sorry...");
	}

}



		
		
		

	
  



