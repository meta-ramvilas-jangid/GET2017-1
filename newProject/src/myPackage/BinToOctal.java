package myPackage;

public class BinToOctal {
	



	int convertBinaryToOctal(long  n) {
			// TODO Auto-generated method stub
//			System.out.println("enter a binary no");
//			long binary=0;;
//			Scanner sc =new Scanner(System.in);
			long remainder;
			long decimal=0;
			StringBuffer octal=new StringBuffer();
			while(n!=0) {
				remainder=n%1000;                          //break from left in set of 3 digits
				decimal=convertToDecimal(remainder);       //convert set of 3 digits into decimal no
				octal=octal.insert(0, decimal);            //insert the decimal number at first place
				n=n/1000;
			}
			return Integer.parseInt(octal.toString());
			
		}
	//function to convert from binary to decimal
		public long convertToDecimal(long rem) {
			long decimal=0;
		int j=1;
			while(rem!=0)
			{
				decimal=decimal+(rem%10)*j;             //seperate lowest significant digit       
				j=j*2;                                  //compute next power of 2
				rem=rem/10;
			}
			return decimal;
			
		}

	}


