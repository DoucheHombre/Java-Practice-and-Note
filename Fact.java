import java .util.Scanner;
public class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n= sc.nextInt();
		int factorial = findFact(n);
		System.out.println("The factorial of "+n+" is = "+factorial);
		}
	public static int findFact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else {
			return n*findFact(n-1);
		}
	}

}
