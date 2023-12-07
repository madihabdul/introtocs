/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Madiha Abdul Maajid, maa525, maa525@scarletmail.rutgers.edu
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) { 

		int arrayLength = args.length;
		int [] firstArray = new int[arrayLength];
		int [] secondArray = new int[arrayLength];
		boolean matchFound = false;

		for(int i = 0; i < arrayLength; i++) {
			firstArray[i] = Integer.parseInt(args[i]);
			secondArray[i] = Integer.parseInt(args[i]);
		}

		for(int i = 0; i < arrayLength; i++) {
			for(int k = i + 1; k < arrayLength; k++) {
				
				if(firstArray[i] == secondArray[k]) {
					matchFound = true;
				} 
			
			}
		}
		System.out.print(matchFound);
		
	}

}
