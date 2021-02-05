import java.util.Scanner;
public class SumOfDigitsOfANum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int result = sumOfDigit(num);
		System.out.println("The sum of digits is = "+result);
	}
	
	public static int sumOfDigit(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else
		{
			return num%10 + sumOfDigit(num/10);
		}
	}

}
