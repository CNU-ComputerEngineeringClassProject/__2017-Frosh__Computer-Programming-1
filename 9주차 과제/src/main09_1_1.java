import java.util.Scanner;

public class main09_1_1 {

	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int score = 0;
		int numberOfStudent = 0;
		int n = 0;
		int above = 0;
		double average = 1;
		int[] scores = new int[MAX_SIZE];
		int Max;
		int Min;

		System.out.print(">점수를 입력하시오.: ");
		score = myScanner.nextInt();

		if (score >= 0) {
			while (score >= 0) {
				if (score > 100) {
					System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
				} else {
					scores[numberOfStudent] = score;
					numberOfStudent++;
				}
				System.out.print(">점수를 입력하시오.: ");
				score = myScanner.nextInt();
			}

		}
		Max = calcMax(scores, numberOfStudent);
		Min = calcMin(scores, numberOfStudent);
		average = calcAverage(scores, numberOfStudent);

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두" + numberOfStudent + "명의 성적이 입력되었습니다.");
		System.out.println("평균은" + average + "입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");

		while (n < numberOfStudent) {
			if (scores[n] > average) {
				System.out.println("[" + n + "]" + scores[n] + " (평균 이상입니다)");
				above++;
			} else if (scores[n] < average) {
				System.out.println("[" + n + "]" + scores[n] + " (평균 미만입니다)");
			} else {
				System.out.println("[" + n + "]" + scores[n] + " (평균 입니다)");
			}
			n++;
		}

		System.out.println("평균 이상인 학생의 수는 " + above + " 명 입니다.");
		System.out.println();
		System.out.println("최고점은 " + Max + " 점 입니다.");
		System.out.println("최저점은 " + Min + " 점 입니다.");
		System.out.println();
		System.out.println("성적순은 다음과 같습니다.");
		selectionSort(scores, numberOfStudent);
		System.out.println("프로그램을 종료합니다.");

	}

	private static double calcAverage(int[] elements, int aSize) {
		int i = 0;
		int sum = 0;
		double average;

		while (i < aSize) {
			sum = sum + elements[i];
			i++;
		}

		average = (double) sum / aSize;

		return average;

	}

	private static int calcMax(int[] elements, int aSize) {
		int j = 0;
		int max = elements[0];

		while (j < aSize) {
			if (elements[j] >= max) {
				max = elements[j];
			} else {
			}
			j++;
		}
		return max;

	}

	private static int calcMin(int[] elements, int aSize) {
		int z = 0;
		int min = elements[0];

		while (z < aSize) {
			if (elements[z] <= min) {
				min = elements[z];
			} else {
			}
			z++;
		}
		return min;

	}

	private static void selectionSort(int[] elements, int aSize) {

		int lastLoc = aSize - 1;
		int maxLoc;
		int maxValue;
		int selectionLoc = 0;
		int curLoc;

		while (selectionLoc < lastLoc) {
			maxLoc = selectionLoc;
			maxValue = elements[maxLoc];
			curLoc = selectionLoc + 1;
			while (curLoc <= lastLoc) {
				if (elements[curLoc] >= maxValue) {
					maxLoc = curLoc;
					maxValue = elements[maxLoc];
				} else {
				}
				curLoc++;
			}
			elements[maxLoc] = elements[selectionLoc];
			elements[selectionLoc] = maxValue;
			selectionLoc++;

		}

		selectionLoc = 0;
		while (selectionLoc < aSize) {
			System.out.println("[" + selectionLoc + "] " + elements[selectionLoc]);
			selectionLoc++;

		}
	}
}
