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
		
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�.: ");
		scoreOfKorean = myScanner.nextInt();
		scoreOfComputer = myScanner.nextInt();
		
		if(scoreOfKorean >=0 && scoreOfComputer >=0 ) {
			while(scoreOfKorean >=0 && scoreOfComputer >=0 ) {
				if(scoreOfKorean >100 || scoreOfComputer > 100) {
					System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
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
				System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�.: ");
				scoreOfKorean = myScanner.nextInt();
				scoreOfComputer = myScanner.nextInt();
			}
			
		}
		
		n=0;
		averageOfClass = (double) sumOfAverage / numberOfStudent ;
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("���"+numberOfStudent+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		
		while(n<numberOfStudent) {
			System.out.println("["+n+"] "+scoresKorean[n]+" " +scoresComputer[n]+" (��� "+average[n]+")");
			if(average[n]>averageOfClass) {
				above++;
			}
			else {}
			n++;
		}
		System.out.println();
		System.out.println("�б� �����  "+averageOfClass+" �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� "+above+" �� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
