package assignmentPfDay2;

public class Pattern1 {
	/*method to return the numbers string*/
	public String numbers(int rows,int n){
		int length=0,j=0;
		String s="";                          //initialize with empty string
		if(rows>=n){
			rows=(n-(rows%n));               //calculate the effective row no
		}
		length=2*rows-1;                     //calculate the length of no string
		for(int i=1;i<=length;i++){
			if(i>rows){                      //if no is greater than max element
				j+=-1;                       //trace back again in reverse order
			}else{                           //else
				j=i;                         //continue
			}
			s=s.concat(String.valueOf(j));   //generate the string
		}
		return String.valueOf(s);            //return value of string  
	}
	
	/*method to return the spaces string*/
	public String spaces(int rows,int n){
		String s="";                         //initialize with empty string
			if(rows<n){                      //if row no is greater than n
				for(int j=(n-1);j>=(rows%n);j--){
					s=s.concat(" ");         //generate spaces string in increasing order
				}
			}else{//else
				for(int j=1;j<=(rows%n);j++){
					s=s.concat(" ");         //generate spaces string in increasing order
				}
			}
			return String.valueOf(s);        //return spaces string
		
	}
	
	/*method to return the whole pattern in a string array*/
	public String[] printPyramid(int n){
		int rows=2*n-1;                      //calculate the no of rows
		String s[]=new String[rows];
		for(int i=1;i<=rows;i++){      
			s[i-1]=spaces(i,n);              //get the spaces string
			s[i-1]=s[i-1].concat(numbers(i,n));//concatenate with number string
		}
		return s;                             //return String array
	}
	

}
