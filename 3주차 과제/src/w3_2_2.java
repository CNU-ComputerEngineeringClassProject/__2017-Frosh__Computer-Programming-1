import java.util.Scanner;

public class w3_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int givenN;
		int sum=0;
		int count=1;
		
		System.out.println("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N���� �Է��Ͻÿ� :");
		
		givenN = aScanner.nextInt();
		
		while (count <= givenN) {
			sum = sum +count;
			count=count+1;
			}
		System.out.print ("�հ�:"+sum);
		
		aScanner.close();
	}
}
