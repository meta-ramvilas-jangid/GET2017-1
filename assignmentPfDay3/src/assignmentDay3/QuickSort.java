package assignmentDay3;

public class QuickSort {
	
	public int[] quickSort(int arr[], int startIndex, int endIndex) {
		if(arr.length==0){
			throw new IllegalArgumentException("input array should not be empty");         		//if array length is zero
		}else if(startIndex < endIndex){														//throw an exception
			int pi = partition(arr, startIndex, endIndex);										//get the partitioning index
			quickSort(arr, startIndex, pi-1);													//sort the lower partition recursively
			quickSort(arr, pi+1, endIndex);														//sort the upper partition recursively
		}
		return arr;																				//return the sorted array
	}
	
	
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	    array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	public static int partition(int[] arr, int startIndex, int endIndex){
		int pivot = arr[endIndex];															
		int i = startIndex-1,j;
		for(j = startIndex; j < endIndex; j++ ){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[endIndex];
		arr[endIndex] = temp;
		return i+1;
	}

}
