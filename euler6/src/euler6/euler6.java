package euler6;

public class euler6 {
	public static void main(String args[]){
		int SumsofSquares = 0;
		int SquareofSums = 0;
		int sum = 0 ;
		int dif = 0;
		for(int i = 1; i <= 100; i++){
			SumsofSquares += i*i;
			sum += i ;
		}
		SquareofSums = (sum * sum);
		dif = SquareofSums - SumsofSquares;
		System.out.println(dif);
		
	}
}
