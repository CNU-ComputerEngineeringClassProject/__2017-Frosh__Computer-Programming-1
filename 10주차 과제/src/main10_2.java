import java.util.Scanner;

public class main10_2 {

	private static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		GPACounter gpa = new GPACounter();
		
		int currentScoreKorean;
		int currentScoreEnglish;
		int currentScoreComputer;

		System.out.print(">세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오: ");
		currentScoreKorean = inputScore();
		student.setScoreKorean(currentScoreKorean);

		currentScoreEnglish = inputScore();
		student.setScoreEnglish(currentScoreEnglish);

		currentScoreComputer = inputScore();
		student.setScoreComputer(currentScoreComputer);

		while ((currentScoreKorean >= 0) && (currentScoreEnglish >=0) && (currentScoreComputer >=0)) {
			if ((currentScoreKorean > 100) || (currentScoreEnglish > 100) || (currentScoreComputer > 100)) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			} 
			else {
				System.out .println("[국   어] 점수: " + currentScoreKorean + ", 학점: "+student.gradeKorean() + ", 평점: " +student.gradePointKorean ());
				System.out .println("[영   어] 점수: " + currentScoreEnglish + ", 학점: "+student.gradeEnglish() + ", 평점: " +student.gradePointEnglish ());
				System.out .println("[컴퓨터] 점수: " + currentScoreComputer + ", 학점: "+student.gradeComputer() + ", 평점: " +student.gradePointComputer ());
				System.out .println("이 학생의 평균평점은 "+student.gpa()+" 입니다.");
				gpa.count(student.gpa());
			
			}
			
			System.out.print(">세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오: ");
			currentScoreKorean = inputScore();
			student.setScoreKorean(currentScoreKorean);

			currentScoreEnglish = inputScore();
			student.setScoreEnglish(currentScoreEnglish);

			currentScoreComputer = inputScore();
			student.setScoreComputer(currentScoreComputer);

		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 3.0 이상인 학생은 "+gpa.numberOfGPA3()+"명 입니다.");
		System.out.println("평균평점이 2.0이상 3.0 미만인 학생은 "+gpa.numberOfGPA2()+"명 입니다.");
		System.out.println("평균평점이 1.0이상 2.0 미만인 학생은 "+gpa.numberOfGPA1()+"명 입니다.");
		System.out.println("평균평점이 1.0미만인 학생은 "+gpa.numberOfGPA0()+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}

	
	private static int inputScore() {

		return myScanner.nextInt();

	}

}
