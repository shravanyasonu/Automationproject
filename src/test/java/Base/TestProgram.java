package Base;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers={22,55,7,1};
		
		int temp;
		
		
		for(int i=0;i<=3;i++)
		{
			
			for(int j=i+1;j<numbers.length;j++)
			{
				
				
				if(numbers[i]>numbers[j])
				{
					
				 temp	= numbers[i];
				 
				     numbers[i]    = numbers[j];
				     
				             numbers[j] =temp;
				 
					
					
				}
				
				
			}
			
			
			
		}
		
		System.out.println( "minimum number is "+ numbers[0]);
		System.out.println( "maximum number is "+ numbers[3]);

	}

}
