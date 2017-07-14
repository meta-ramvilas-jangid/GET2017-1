package myPackage;

public class RemoveDuplicates {
	
	int[] remDups(int arr[]) {
		//int arr[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int index[]=new int[arr.length]; //create a new array corresponding to original array to mark duplicates
		int count=0,k=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j < arr.length && index[i]!=1;j++){
				if(arr[i]==arr[j]){
					index[j]=1;           //mark a 1 if duplicate found
					count++;             //count no of duplicates
					
				}
			}
		}
		int unique[]=new int[arr.length-count];      //unique array with no duplicates
		for(int i=0;i<index.length;i++){
			//System.out.println(index[i]);
			if(index[i]!=1){
				unique[k++]=arr[i];                  //assign unique elements
				//System.out.println(unique[k++]);
			}
			
		}
		return unique;
		
		

	}

}
