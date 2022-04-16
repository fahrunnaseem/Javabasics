package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = -40;
		if(a<0) {
			int b = Math.abs(a);
			System.out.println("The number" + a + "is converted to" +b);
		}else
		{
			System.out.println("The number" + a + "is not converted");
		}

	}

}
