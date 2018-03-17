package euler5;

public class euler5 {
	public static void main(String args[]){
		boolean div = false;
		int result=0;
		for(int i = 2520;div == false ;i+=20)
		{
			for(int j = 19; j > 1; j--)
			{
				if(i % j != 0)
					break;
				
				
				if(j == 2)
				{
					result=i;
					div = true;
				}
				
			}
		}
		System.out.println(result);
	}
}
