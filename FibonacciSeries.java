package week1.day1.assignments;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result, num1=0, num2=1, n=5, i;
		
		for(i=1;i<=n;++i) {
			
		result=num1+num2;
		num1=num2;
		num2=result;
		
		System.out.println( num1+" ");
		}
		
		
		}

	}


