package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		
		
		int fact=1;
		int num=4;
		for (int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial of 5 is "+fact);
	}

}
