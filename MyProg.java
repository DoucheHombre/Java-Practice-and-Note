import java.util.Scanner;
public class MyProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=sc.nextInt();
		
		int addition=findSum(n);
		System.out.println("The sum of "+n+" is = "+addition);
	}
	public static int findSum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else {
			return n + findSum(n-1);
		}
	}

}
