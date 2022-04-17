package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {
		LearnMethods LM = new LearnMethods();

		LM.printcarname();

		int regnum = LM.getcarregnum();
		System.out.println("Register number is" + regnum);

		String varient = LM.getcarvarient();
		System.out.println("Varient is" + varient);

		double multiply = LM.multiplytwonumbers(2, 4.4);
		System.out.println("Multiplied value is" + multiply);

	}

	public void printcarname() {
		System.out.println("Car name is polo");
	}

	private int getcarregnum() {
		int regnum = 2345;
		return regnum;
	}

	public String getcarvarient() {
		String carvarient = "petrol";
		return carvarient;
	}

	public double multiplytwonumbers(int a, double b) {
		return a * b;

	}

}
