package assignmentDay3;

public class LargestDigit {
	
	int maxDigit;																		//global variable to hold maxDigit
	
	public  int largestDigit(int number){
		int lastDigit;																	//declare a variable to hold the least significant digit
		if(number == 0){																//if number is zero (base case)
			return maxDigit;															//return max Digit
		}
		if(number < 0){																	//if number is negative
			throw new IllegalArgumentException("number should be greater than zero");	//throw an exception
		}
		lastDigit = number % 10;														//calculate the least significant digit
		if(lastDigit > maxDigit){														//compare with previous max
			maxDigit = lastDigit;														//set the maxDigit
		}
		return largestDigit(number / 10);                        						//call recursively with least significant digit removed
	}
	

}
