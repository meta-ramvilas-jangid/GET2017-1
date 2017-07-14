package myPackage;

public class Merging {

	int[] join(int a[], int asize, int b[], int bsize) {
		// TODO Auto-generated method stub
		//int a[]={1,2,4,6,8,9},b[]={2,2,3,5,6,7,8,9,9};
		int c[]=new int[asize+bsize];                         //resulting array after merging
		int i=0,j=0,k=0;
		while (i < asize && j < bsize) {                      
	        if (a[i] < b[j]){                                 //if a's element is less than b's
	            c[k] = a[i];                                  //assign it to c
	            i++;
	        }else{
	            c[k] = b[j];                                  //else assign b's element to c
	            j++;
	        }
	        k++;
	    }
	    if (i >= asize){                                     //assign leftover to c by a if present
	        while (j < bsize)
	        {
	            c[k] = b[j];
	            j++;
	            k++;
	        }
	    }
	    if (j >= bsize){                                   //assign leftover to c by a if present
	        while (i < asize){
	            c[k] = a[i];
	            i++;
	            k++;
	        }
	    }

//		for(k=0;k<c.length;k++){
//			System.out.print(" "+c[k]);
//		}
		return c;

	}

}
