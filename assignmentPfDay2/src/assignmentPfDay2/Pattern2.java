package assignmentPfDay2;

public class Pattern2 {
	public String spaces(int rows, int n){
		String s="";                          //initialize the string
		for(int j=1;j<rows;j++){              //length of spaces string=rows-1
			s=s.concat(" ");                  //get the spaces string
		}
		return String.valueOf(s);             //return spaces string
	}
	public String numbers(int rows, int n){
		String s="";                          //initialize with empty string
		for(int j=0;j<=n-rows;j++){           //length of numbers string=n-row n0
			s=s.concat(String.valueOf(j+1));  //get the numbers string
		}
		return String.valueOf(s);             //return string
	}
	public String[] printPyramid(int n){
		int rows=n;
		String pyramid[]=new String[rows];
		for(int i=1;i<=rows;i++){
			pyramid[i-1]=spaces(i,n);         //get the spaces string
			pyramid[i-1]=pyramid[i-1].concat(numbers(i,n));//concatenate it with numbers string
		}
		return pyramid;                       //return the array of strings
	}	
	
}
