package myPackage;

public class Order {

	int checkOrder(int []arr) {
		// TODO Auto-generated method stub
		//int arr[]={9,7,5,3,1,1,1,1,0,0,0,0,};
		int status=0;
		if(arr.length==0){
			status=0;
		}else{
		int flag=arr[1]-arr[0];
		if(flag>0){
			status=1;
		}else if(flag<0){
			status=2;
		}
		for(int i=2;i<arr.length;i++)
		{
			if((arr[i-1] < arr[i] && status==2)  || (arr[i-1] > arr[i] && status==1 )  ){
				status=0;
				break;
			}else if(arr[i-1] < arr[i] &&status==0){
				status=1;
			}else if(arr[i-1] > arr[i] &&status==0){
				status=2;
			}
		}
		}
		//System.out.println(status);
		switch(status){
		case 0:System.out.println("no order");break;
		case 1:System.out.println("ascending");break;
		case 2:System.out.println("descending");break;
		default:System.out.println("no");break;
		}
		return status;
	}
}
