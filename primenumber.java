package week1.day1.assignments;

public class primenumber {

	public static void main(String[] args) {
		
		
		int i,m,n=19;
		boolean flag=false;
		
		for(i=2;i<=n/2;i++)
		
		if(n%i==0)
		{
			System.out.println(n +"not a prime number");
			flag=true;
			break;
			
			
		}
		if(flag==false)
		{
			System.out.println(n +" is a prime number");
			
		}
		// TODO Auto-generated method stub

	}

}
