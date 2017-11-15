
public class main06_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree=1;
		double radian=0;
		double sineValue=0;
		int numberOfAsterisks=0;
		
		
		while(degree>0 && degree<=176) {
			radian = ( (double) degree / 180.0) * 3.141592 ;
			sineValue = mySine (radian);
			numberOfAsterisks = (int) ((sineValue * 40.0) +0.5  ) ;
			System.out.print("sine("+degree+"µµ)");
			printAsterisks(numberOfAsterisks);
			degree=degree+5;
		}

	}
	
	private static double mySine (double x){
		double  xSquare = x * x ; 
		double  currentTerm = x ; 
		int  n = 2 ; 
		double sineValue = currentTerm ; 
		while ( Math.abs(currentTerm) >= 0.000001 ) { 
			currentTerm = - currentTerm * xSquare / (double) ( n*(n+1) ) ; 
			sineValue = sineValue + currentTerm ; n = n + 2 ; 
			} 
		return  sineValue ;
	}

	
	private static void printAsterisks(int n) {
		
		int a=1;
		
		while(a<=n) {
		System.out.print("*");
		a++;
		}
		
		System.out.println();
	
	}

}
