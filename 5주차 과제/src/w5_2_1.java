public class w5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =1;
		double x=0;
		double y=0;
		
		System.out.println("<< Sin 값 출력 프로그램을 시작 합니다.>>");
		System.out.println();
		
		while(number>0 && number<=180)
		{
			x=(double) number * (3.141592 / 180.0);
			y = Math.sin(x);
			System.out.println("("+number+"도) 는 "+y+" 입니다.");
			number++;
		}
		System.out.println();
		System.out.println("<< Sin 값 출력 프로그램을 종료 합니다.>>");
	}

}
