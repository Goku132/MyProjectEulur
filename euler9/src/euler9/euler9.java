package euler9;

public class euler9 {
	public static void main (String args[]){
		boo();
	}
	
	public static void boo( ){
		for ( int c = 0;;c++ ){
			for(int b = 0; b < c ; b++){
				for(int a = 0; a < b; a++){
					if(a*a + b*b == c*c){
						if(a + b + c == 1000){
							System.out.println(a + " " + b + " " + c);
							System.out.println(a * b * c);
							return ;
						}
						
					}
				}
			}
		}
	}
}
