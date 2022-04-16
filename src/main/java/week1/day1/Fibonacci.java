package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int r=8;
	int firstNum=0;
	int secNum=1;
	int sum=0;

	System.out.println(firstNum);
	for(int i=secNum;i<=r;i++)
	{
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
	}

		}

	}


