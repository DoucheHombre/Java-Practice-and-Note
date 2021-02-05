import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number= ");
		int n = sc.nextInt();
		boolean result = prime(n,2);
		if(result == true)
		{
			System.out.println("The number "+n+" is prime.");
		}
		else
		{
			System.out.println("The number "+n+" is not prime");
		}
	}
	
	public static boolean prime(int n,int i)
	{
		if(n<=2)
		{
			if(n==2)
			{
			return true;
			}
			else
			{
				return false;
			}
		}
		if(n%i == 0)
		{
			return false;
		}
		if(i*i > n)
		{
			return true;
		}
		
		return prime(n,i+1);
	}

}
