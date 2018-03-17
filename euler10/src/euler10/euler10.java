package euler10;

public class euler10 {
	public static void main(String args[] ){
		 boolean myArray[] = new boolean[2000000];
		 for(int i = 0; i < myArray.length; i++)
			 myArray[i]= true;
		 
		 int limit = (int) (Math.sqrt(myArray.length))+1;
		 for(int i = 2; i < limit;i++){
			 if(myArray[i] == true){
				 for(int j = i * 2; j < myArray.length; j+=i){
					 myArray[j] = false;
				 }
			 }
		 }
		 System.out.println(sum(myArray));
	}
	
	public static long sum(boolean[]myArray){
		long answer = 0;
		for(int i = 2 ; i < myArray.length;i++){
			if(myArray[i]== true){
				answer = i + answer;
			}
		}
		return answer;
	}
}
