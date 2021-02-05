import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();
		printFibo(0,1,num);
	}
	public static void printFibo(int a,int b,int num)
	{
		if(num==0)
		{
			return;
		}
		else
		{
			System.out.print(a+" ");
			int sum = a+b;
			printFibo(b,sum,num-1);
		}
	}

}
