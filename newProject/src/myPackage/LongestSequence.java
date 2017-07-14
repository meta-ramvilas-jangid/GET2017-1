package myPackage;

public class LongestSequence {

	int[] longestSequence(int input[]) {
		// TODO Auto-generated method stub
		//int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int j=0,k=0,count=1,prevCount=1;
		for(int i=0;i<input.length;i++){
			if(i+1<input.length && input[i] < input[i+1] ){
				count++;                                      //count a particular sequence length
			}else{
				if(count>prevCount){                          //compare with previous sequence length
					prevCount=count;                          //find max sequence length
					j=i;                                      // index where sequence ends 
				}
				count=1;
			}
			
		}
		int ls[]=new int[prevCount];                        //new longest sequence array
		k=j-prevCount+1;                                    //adjust the indexes
		for(int i=k;i<k+prevCount;i++){                     //assign the sequence to new array
			ls[i-k]=input[i];
			
		}
		return ls;
			//System.out.println(input[i]);

	}

}
