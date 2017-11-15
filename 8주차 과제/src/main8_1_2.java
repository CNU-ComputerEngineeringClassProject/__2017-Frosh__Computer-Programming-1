import java.util.Scanner;
public class main8_1_2 {

	private static final int MAX_SIZE = 100 ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int scoreOfKorean=0;
		int scoreOfComputer=0;
		int numberOfStudent=0;
		int n=0;
		int total=0;
		int above=0;
		double sumOfAverage=0;
		double averageOfClass =1;
		int[] scoresKorean = new int[MAX_SIZE];
		int[] scoresComputer = new int[MAX_SIZE];
		double[] average = new double[MAX_SIZE];
		
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오.: ");
		scoreOfKorean = myScanner.nextInt();
		scoreOfComputer = myScanner.nextInt();
		
		if(scoreOfKorean >=0 && scoreOfComputer >=0 ) {
			while(scoreOfKorean >=0 && scoreOfComputer >=0 ) {
				if(scoreOfKorean >100 || scoreOfComputer > 100) {
					System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
				}
				else {
					scoresKorean[numberOfStudent]=scoreOfKorean;
					scoresComputer[numberOfStudent]=scoreOfComputer;
					numberOfStudent++;
					total = scoreOfKorean+scoreOfComputer;
					average[n]= (double) total / 2;
					sumOfAverage = sumOfAverage+average[n];
					n++;
				}
				System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오.: ");
				scoreOfKorean = myScanner.nextInt();
				scoreOfComputer = myScanner.nextInt();
			}
			
		}
		
		n=0;
		averageOfClass = (double) sumOfAverage / numberOfStudent ;
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두"+numberOfStudent+"명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		
		while(n<numberOfStudent) {
			System.out.println("["+n+"] "+scoresKorean[n]+" " +scoresComputer[n]+" (평균 "+average[n]+")");
			if(average[n]>averageOfClass) {
				above++;
			}
			else {}
			n++;
		}
		System.out.println();
		System.out.println("학급 평균은  "+averageOfClass+" 입니다.");
		System.out.println("평균 이상인 학생의 수는 "+above+" 명 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	}

}
