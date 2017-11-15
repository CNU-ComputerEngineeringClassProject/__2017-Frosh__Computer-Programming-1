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

		System.out.print(">�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
		currentScoreKorean = inputScore();
		student.setScoreKorean(currentScoreKorean);

		currentScoreEnglish = inputScore();
		student.setScoreEnglish(currentScoreEnglish);

		currentScoreComputer = inputScore();
		student.setScoreComputer(currentScoreComputer);

		while ((currentScoreKorean >= 0) && (currentScoreEnglish >=0) && (currentScoreComputer >=0)) {
			if ((currentScoreKorean > 100) || (currentScoreEnglish > 100) || (currentScoreComputer > 100)) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			} 
			else {
				System.out .println("[��   ��] ����: " + currentScoreKorean + ", ����: "+student.gradeKorean() + ", ����: " +student.gradePointKorean ());
				System.out .println("[��   ��] ����: " + currentScoreEnglish + ", ����: "+student.gradeEnglish() + ", ����: " +student.gradePointEnglish ());
				System.out .println("[��ǻ��] ����: " + currentScoreComputer + ", ����: "+student.gradeComputer() + ", ����: " +student.gradePointComputer ());
				System.out .println("�� �л��� ��������� "+student.gpa()+" �Դϴ�.");
				gpa.count(student.gpa());
			
			}
			
			System.out.print(">�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
			currentScoreKorean = inputScore();
			student.setScoreKorean(currentScoreKorean);

			currentScoreEnglish = inputScore();
			student.setScoreEnglish(currentScoreEnglish);

			currentScoreComputer = inputScore();
			student.setScoreComputer(currentScoreComputer);

		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 3.0 �̻��� �л��� "+gpa.numberOfGPA3()+"�� �Դϴ�.");
		System.out.println("��������� 2.0�̻� 3.0 �̸��� �л��� "+gpa.numberOfGPA2()+"�� �Դϴ�.");
		System.out.println("��������� 1.0�̻� 2.0 �̸��� �л��� "+gpa.numberOfGPA1()+"�� �Դϴ�.");
		System.out.println("��������� 1.0�̸��� �л��� "+gpa.numberOfGPA0()+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}

	
	private static int inputScore() {

		return myScanner.nextInt();

	}

}
