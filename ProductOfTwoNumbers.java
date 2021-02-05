import java.util.Scanner;
public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number = ");
		int num1 =sc.nextInt();
		System.out.println("Enter second number = ");
		int num2 =sc.nextInt();
		int result = product(num1,num2);
		System.out.println("The product of "+num1+" and "+num2+" is = "+result);
	}
	
	public static int product(int n, int m)
	{
		if(m==1)
		{
			return n;
		}
		else
		{
			return n + product(n,m-1);
		}
	}

}
