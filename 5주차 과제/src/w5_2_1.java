public class w5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =1;
		double x=0;
		double y=0;
		
		System.out.println("<< Sin �� ��� ���α׷��� ���� �մϴ�.>>");
		System.out.println();
		
		while(number>0 && number<=180)
		{
			x=(double) number * (3.141592 / 180.0);
			y = Math.sin(x);
			System.out.println("("+number+"��) �� "+y+" �Դϴ�.");
			number++;
		}
		System.out.println();
		System.out.println("<< Sin �� ��� ���α׷��� ���� �մϴ�.>>");
	}

}
