package assignmentDay3;

public class Gcd {
	public int gcd(int firstNo, int secondNo){
		if(firstNo <= 0 || secondNo <= 0){																//if any of the 2 inputs is/are -ve
			throw new IllegalArgumentException("firstNo should be > 0 and/or secondNo should be > 0");	//throw an exception
		}else if(secondNo == firstNo || secondNo == 1){													//if both are equal or second no is one 
			return secondNo;																			//return secondNo
		}else if(firstNo < secondNo){																	//if first no is less than second no
			int temp = firstNo;																			
			firstNo = secondNo;																			//swap them
			secondNo = temp;
		}
		return gcd(firstNo-secondNo, secondNo);															//call recursively
	}


}
