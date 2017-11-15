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
		
		System.out.println("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
		currentScoreOfKorean = inputScore();
		currentScoreOfEnglish = inputScore();
		currentScoreOfComputer = inputScore();
		

		if (currentScoreOfKorean < 0||currentScoreOfEnglish<0||currentScoreOfComputer<0) {
			
		}
		else {
			while (currentScoreOfKorean >= 0 && currentScoreOfEnglish>=0&&currentScoreOfComputer>=0) {
				if (currentScoreOfKorean > 100||currentScoreOfEnglish>100||currentScoreOfComputer>100) {
					System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
				} else {
					gradeOfKorean = score2Grade(currentScoreOfKorean);
					gradeOfEnglish = score2Grade(currentScoreOfEnglish);
					gradeOfComputer = score2Grade(currentScoreOfComputer);
					pointOfKorean = grade2Point(gradeOfKorean);
					pointOfEnglish = grade2Point(gradeOfEnglish);
					pointOfComputer = grade2Point(gradeOfComputer);
					gradePointAverage = calcGPA(pointOfKorean,pointOfEnglish,pointOfComputer);
					System.out.println("[국   어] 점수: " + currentScoreOfKorean + ", 학점: " + gradeOfKorean+ ", 평점: " + pointOfKorean);
					System.out.println("[영   어] 점수: " + currentScoreOfEnglish + ", 학점: " + gradeOfEnglish+ ", 평점: " + pointOfEnglish);
					System.out.println("[컴퓨터] 점수: " + currentScoreOfComputer + ", 학점: " + gradeOfComputer+ ", 평점: " + pointOfComputer);
					System.out.println("이 학생의 평균평점은"+gradePointAverage+"입니다.");
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
				System.out.println("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
				currentScoreOfKorean = inputScore();
				currentScoreOfEnglish = inputScore();
				currentScoreOfComputer = inputScore();
			}

		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균 평점이 4.0이상인 학생은 "+count4+"명 입니다.");
		System.out.println("평균 평점이 3.0이상 4.0미만인 학생은 "+count3+"명 입니다.");
		System.out.println("평균 평점이 2.0이상 3.0미만인 학생은 "+count2+"명 입니다.");
		System.out.println("평균 평점이 1.0이상 2.0미만인 학생은 "+count1+"명 입니다.");
		System.out.println("평균 평점이 1.0미만인 학생은 "+count0+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}

	private static int inputScore() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("-점수를 입력하시오: ");
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
