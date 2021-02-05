import java.util.Scanner;
public class DecToBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		String result = decimalToBinary(num);
		System.out.println("The Binary format of "+num+" is = "+result);
	}
	
	public static String decimalToBinary(int n)
	{
		if(n==0)
		{
			return ""+0;
		}
		if(n==1)
		{
			return ""+1;
		}
		if(n/2 == 1)
		{
			return n/2 +" "+n%2;
		}
		else
		{
			return decimalToBinary(n/2)+" "+n%2;
		}
	}

}
