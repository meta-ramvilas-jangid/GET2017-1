package assignmentDay3;

public class LinearSearch {

	public int linearSearch(int[] arr, int searchKey, int foundIndex){
		if(arr.length==0){																//if array length is zero
			throw new IllegalArgumentException("ainput array should not be empty");		//throw IllegalArgument Exception
		}
		else if( foundIndex >= arr.length ){											//if index goes beyond the length(base case)
			return -1;																	//return not found
		}else if( searchKey == arr[foundIndex]){										//else if found 
			return foundIndex;															//return the index
		}else{																			//else
			return linearSearch(arr, searchKey, foundIndex+1);							//call method recursively
		}
	}
	
}
