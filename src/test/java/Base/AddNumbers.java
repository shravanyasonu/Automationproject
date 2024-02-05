package Base;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=8976;
		
		int total=0;
		
		
		while(number>0)
		{
			
		int partialNumber	=number%10; // 8976 /10 =
		
		 total=total+partialNumber;
		 
		  number=number/10; //8976/10 
		 
			
		}
		
		System.out.println(total);

	}

}
