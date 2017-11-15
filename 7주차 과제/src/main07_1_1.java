import java.util.Scanner;

public class main07_1_1 {
	
	public static void main(String[] args) {

		int currentScoreOfKorean;
		int currentScoreOfEnglish;
		int currentScoreOfComputer;
		int count4=0;
		int count3=0;
		int count2=0;
		int count1=0;
		int count0=0;
		char gradeOfKorean = 0;
		char gradeOfEnglish = 0;
		char gradeOfComputer = 0;
		double pointOfKorean;
		double pointOfEnglish;
		double pointOfComputer;
		double gradePointAverage=0;
		
		System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
		currentScoreOfKorean = inputScore();
		currentScoreOfEnglish = inputScore();
		currentScoreOfComputer = inputScore();
		

		if (currentScoreOfKorean < 0||currentScoreOfEnglish<0||currentScoreOfComputer<0) {
			
		}
		else {
			while (currentScoreOfKorean >= 0 && currentScoreOfEnglish>=0&&currentScoreOfComputer>=0) {
				if (currentScoreOfKorean > 100||currentScoreOfEnglish>100||currentScoreOfComputer>100) {
					System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
				} else {
					gradeOfKorean = score2Grade(currentScoreOfKorean);
					gradeOfEnglish = score2Grade(currentScoreOfEnglish);
					gradeOfComputer = score2Grade(currentScoreOfComputer);
					pointOfKorean = grade2Point(gradeOfKorean);
					pointOfEnglish = grade2Point(gradeOfEnglish);
					pointOfComputer = grade2Point(gradeOfComputer);
					gradePointAverage = calcGPA(pointOfKorean,pointOfEnglish,pointOfComputer);
					System.out.println("[��   ��] ����: " + currentScoreOfKorean + ", ����: " + gradeOfKorean+ ", ����: " + pointOfKorean);
					System.out.println("[��   ��] ����: " + currentScoreOfEnglish + ", ����: " + gradeOfEnglish+ ", ����: " + pointOfEnglish);
					System.out.println("[��ǻ��] ����: " + currentScoreOfComputer + ", ����: " + gradeOfComputer+ ", ����: " + pointOfComputer);
					System.out.println("�� �л��� ���������"+gradePointAverage+"�Դϴ�.");
					if(gradePointAverage>=4.0) {
						count4++;
					}
					else if(gradePointAverage>=3.0) {
						count3++;
					}
					else if(gradePointAverage>=2.0) {
						count2++;
					}
					else if(gradePointAverage>=1.0) {
						count1++;
					}
					else {
						count0++;
					}
				}
				System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
				currentScoreOfKorean = inputScore();
				currentScoreOfEnglish = inputScore();
				currentScoreOfComputer = inputScore();
			}

		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� ������ 4.0�̻��� �л��� "+count4+"�� �Դϴ�.");
		System.out.println("��� ������ 3.0�̻� 4.0�̸��� �л��� "+count3+"�� �Դϴ�.");
		System.out.println("��� ������ 2.0�̻� 3.0�̸��� �л��� "+count2+"�� �Դϴ�.");
		System.out.println("��� ������ 1.0�̻� 2.0�̸��� �л��� "+count1+"�� �Դϴ�.");
		System.out.println("��� ������ 1.0�̸��� �л��� "+count0+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static int inputScore() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("-������ �Է��Ͻÿ�: ");
		return myScanner.nextInt();
	}

	private static char score2Grade (int aScore) {

		if (aScore >= 90) {
			return 'A';
		} else if (aScore >= 80) {
			return 'B';
		} else if (aScore >= 70) {
			return 'C';
		} else if (aScore >= 60) {
			return 'D';
		} else {
			return 'F';
		}

	}
	private static double grade2Point(char aGrade) {
		if (aGrade == 'A') {
			return 4.0;
		} else if (aGrade == 'B') {
			return 3.0;
		} else if (aGrade == 'C') {
			return 2.0;
		} else if (aGrade == 'D') {
			return 1.0;
		} else {
			return 0.0;
		}
		
		
	}
	private static double calcGPA(double point_Korean, double point_English, double point_Computer) {
		return (point_Korean+point_English+point_Computer)/3.0 ;
	}
}
