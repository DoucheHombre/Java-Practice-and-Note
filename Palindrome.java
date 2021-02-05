import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		int result = checkPal(num,0);
		if(result == num)
		{
			System.out.println(num +" is a Palindrome.");
		}
		else
		{
			System.out.println(num +" is NOT a Palindrome.");
		}
	}
	public static int checkPal(int n,int m)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			m=(m*10) + (n%10);
			return checkPal(n/10,m);
		}
	}

}
