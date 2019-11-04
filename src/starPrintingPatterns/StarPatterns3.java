package starPrintingPatterns;

public class StarPatterns3 {
	
	// EXAMPLE OF THIS CODE PATTERN 
	// ******
	// ****
	// ***
	// **
	// *

	public static void main(String[] args) {
		

		int j, i; // i- number of lines; j- number of colums, number of stars on 1 line
		
		//First (outer) loop identifies number of lines.
		//Last print statement has empty (), means just start from new line  
		for (i=0; i<=5; i++ ) {
			
		//second inside loops tells how many symbols will be on the row
		for (j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
			}
		
		
	}
	
  
}
