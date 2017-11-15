import java.util.Scanner;

public class w4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int givenN;
		int x = 1;
		int factorial = 1;
		char userAnswer;

		System.out.println("factorial을 계산하겠습니까?");
		System.out.print("계산하려면 'Y'를 치십시오 : ");

		userAnswer = myScanner.next().charAt(0);

		while (userAnswer == 'Y' || userAnswer == 'y') {

			System.out.print("N!의 N값을 입력하세요 : ");
			givenN = myScanner.nextInt();

			if (givenN < 0) {
				System.out.println("입력이 음수이므로, factorial 값을 계산할 수 없습니다.");
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
				
				System.out.println(givenN + "!은 " + factorial + "입니다.");
				
			}
			System.out.println();
			System.out.println("Factorial 계산을 하시겠습니까?");
			System.out.print("계산하려면 'Y'를 치십시오. : ");

			userAnswer = myScanner.next().charAt(0);
		}
		myScanner.close();
	}

}
