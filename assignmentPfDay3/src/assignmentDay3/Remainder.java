package assignmentDay3;

public class Remainder {
	public int rem(int dividend, int divisor){
		if(dividend < 0 || divisor <= 0){												//if any of the 2 inputs is/are -ve
			throw new IllegalArgumentException("dividend should be >= 0 and divisor should be > 0");//throw an exception
		}else if(dividend < divisor){													//if dividend less than divisor
			return dividend;															//return divisor
		}else{																			//else		
			return rem(dividend-divisor, divisor);										//call remainder function recursively
		}
	}
	
//	public static void main(String []args) throws Exception{
//		System.out.println(Remainder.rem(91,13));
//	}

}
