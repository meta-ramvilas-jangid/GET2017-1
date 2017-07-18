package assignmentDay3;

public class BinarySearch {
	public int binSearch(int arr[], int startIndex, int endIndex, int searchKey) {
		int mid=(startIndex+endIndex)/2;													//mid index of sorted array
		if(arr.length==0){																	//if array length is zero
			throw new IllegalArgumentException("input array should not be empty");      	//throw an exception
		}else if(startIndex > endIndex){													//if start index goes beyond end index i.e not found case(base case)
			return -1;																		//return -1 to indicate not found
		}else if(arr[mid] == searchKey){													//if found
			return mid;																		//return index
		}else if(arr[mid] < searchKey ){													//if less than middle element
			return binSearch( arr, mid+1, endIndex, searchKey);								//traverse the left sub array recursively
		}else{																				//else
			return binSearch( arr, startIndex, mid-1, searchKey);							//traverse the right sub array recursively
		}
	}


}
