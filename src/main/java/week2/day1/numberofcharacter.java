package week2.day1;

public class numberofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "testleaf";
		int k=0;
		char array[] = text1.toCharArray();
		for (int i=0; i<array.length; i++) {
			if (array[i]=='t') {
				k=k+1;
			}
			
		}
		System.out.println("t=" + k);
		
		
		String text2 = "Testleaf is situated in twin towers teynampet";
		String[] split = text2.split(" ");
		System.out.println("Letters starts with T or t");
		for (int i=0; i<split.length; i++) {
			if (split[i].startsWith("T")||split[i].startsWith("t")) {
				System.out.println(split[i]);
				
			}
		}
		
	}
}
