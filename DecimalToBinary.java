import java.util.Scanner;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n= sc.nextInt();
		long binary = decToBin(n);
		System.out.println("The binary of decimal "+n+" is = "+binary);


	}
	public static long decToBin(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			return decToBin(num/2) *10 + num%2;
		}
	}

}
