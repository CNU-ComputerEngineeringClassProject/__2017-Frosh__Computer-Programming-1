import java.util.Scanner;

public class w3_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int givenN;
		int sum=0;
		int count=1;
		
		System.out.println("1부터 N까지 합계를 구하려고 합니다. N값을 입력하시오 :");
		
		givenN = aScanner.nextInt();
		
		while (count <= givenN) {
			sum = sum +count;
			count=count+1;
			}
		System.out.print ("합계:"+sum);
		
		aScanner.close();
	}
}
