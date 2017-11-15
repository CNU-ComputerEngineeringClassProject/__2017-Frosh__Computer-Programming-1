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

		System.out.print(">������ �Է��Ͻÿ�.: ");
		score = myScanner.nextInt();

		if (score >= 0) {
			while (score >= 0) {
				if (score > 100) {
					System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
				} else {
					scores[numberOfStudent] = score;
					numberOfStudent++;
				}
				System.out.print(">������ �Է��Ͻÿ�.: ");
				score = myScanner.nextInt();
			}

		}
		Max = calcMax(scores, numberOfStudent);
		Min = calcMin(scores, numberOfStudent);
		average = calcAverage(scores, numberOfStudent);

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("���" + numberOfStudent + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println("�����" + average + "�Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");

		while (n < numberOfStudent) {
			if (scores[n] > average) {
				System.out.println("[" + n + "]" + scores[n] + " (��� �̻��Դϴ�)");
				above++;
			} else if (scores[n] < average) {
				System.out.println("[" + n + "]" + scores[n] + " (��� �̸��Դϴ�)");
			} else {
				System.out.println("[" + n + "]" + scores[n] + " (��� �Դϴ�)");
			}
			n++;
		}

		System.out.println("��� �̻��� �л��� ���� " + above + " �� �Դϴ�.");
		System.out.println();
		System.out.println("�ְ����� " + Max + " �� �Դϴ�.");
		System.out.println("�������� " + Min + " �� �Դϴ�.");
		System.out.println();
		System.out.println("�������� ������ �����ϴ�.");
		selectionSort(scores, numberOfStudent);
		System.out.println("���α׷��� �����մϴ�.");

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
