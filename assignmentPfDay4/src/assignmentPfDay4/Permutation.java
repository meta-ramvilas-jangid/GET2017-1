package assignmentPfDay4;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	protected List<String> permutations;
	protected int startIndex;
	/*CONSTRUCTOR TO INITIALIZE THE LIST OF PERMUTATIONS*/
	public Permutation(){
		permutations = new ArrayList<String>();
		startIndex=0;
	}
	/*
	 * METHOD TO SWAP TWO CHARACTERS TO GENERATE PERMUTATION
	 */
	public void swap(char[] arr, int i, int j) {
		char temp ;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*METHOD TO GENERATE PERMUTATION OF INCOMING STRINGS*/
	public List<String> permute(String str) {
		if(str.isEmpty()) {													// IF STRING IS EMPTY
			throw new IllegalArgumentException("String cannot be empty");	// THROW EXCEPTION
		}else if(str.equals(null)) {										// IF STRING IS NULL
			throw new NullPointerException();								//THROW EXCEPTION
		}else{																//ELSE
			char[] charArray = str.toCharArray();							//CONVERT STRING TO CHAR ARRAY
			int l=startIndex,i;												
			if(l == charArray.length) {										//IF A PARTICULAR PERMUTATION IS GENERATED I.E INDEX REACHES END OF ARRAY 
				if(!(permutations.contains(str))){							//IF THE PERMUTATION IS ALREADY NOT IN THE LIST
				permutations.add(str);										//ADD THE PERMUTATION
				}
			}else{															//ELSE
				for(i = l; i < charArray.length; i++) {						//UNTIL INDEX REACHES END OF STRING
					swap(charArray, l, i);									//SWAP
					startIndex++;
					permute(String.valueOf(charArray));						//PERMUTE
					swap(charArray, l ,i);									//SWAP (BACKTRACK)
					startIndex = l;											//SET VARIABLE FOR BACKTRACKING
				}
			}
		}
		return permutations;												//RETURN LIST OF PERMUTATIONS
		

	}

}
