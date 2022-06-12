package week1.day1.assignments;


public class FibonacciSeries {
	
	

	public static void main(String[] args) {
		int count=8;
		int firstNum= 0;
		int SecondNum= 1 ;
		System.out.print(firstNum+" "+SecondNum);
		
		for (int i=2;i<count;i++) {
			 
			int sum = firstNum + SecondNum ; 
			System.out.print(" "+sum);
			firstNum=SecondNum; 
			SecondNum=sum; 	
			
		}
		
		
	}}

