import java.util.Scanner;

public class w4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int givenN;
		int x = 1;
		int factorial = 1;
		char userAnswer;

		System.out.println("factorial�� ����ϰڽ��ϱ�?");
		System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ� : ");

		userAnswer = myScanner.next().charAt(0);

		while (userAnswer == 'Y' || userAnswer == 'y') {

			System.out.print("N!�� N���� �Է��ϼ��� : ");
			givenN = myScanner.nextInt();

			if (givenN < 0) {
				System.out.println("�Է��� �����̹Ƿ�, factorial ���� ����� �� �����ϴ�.");
			}

			else {
				if (givenN == 0) {

					factorial = 1;
				} else {
					while (x < givenN + 1) {
						factorial = factorial * x;
						x = x + 1;

					}

					

				}
				
				System.out.println(givenN + "!�� " + factorial + "�Դϴ�.");
				
			}
			System.out.println();
			System.out.println("Factorial ����� �Ͻðڽ��ϱ�?");
			System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ�. : ");

			userAnswer = myScanner.next().charAt(0);
		}
		myScanner.close();
	}

}
