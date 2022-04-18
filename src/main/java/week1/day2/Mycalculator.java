package week1.day2;

public class Mycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		int addition = cal.add(3, 5, 10);
		System.out.println("The addition is - " +addition);
		
		int subtraction = cal.sub(50, 10);
		System.out.println("The subtraction is - " +subtraction);
		
		double multiplication = cal.mul(4.56, 20.8);
		System.out.println("The multiplication is - " +multiplication);
		
		float division = cal.div(3.5f, 4.8f);
		System.out.println("The Division is - " +division);

	}

}
