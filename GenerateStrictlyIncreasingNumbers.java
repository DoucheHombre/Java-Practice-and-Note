import java.util.Scanner;
public class GenerateStrictlyIncreasingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many digits = ");
		int n=sc.nextInt();
		calcNum(0," ",n);
	}
	public static void calcNum(int start,String out,int num)
	{
		if(num == 0)
		{
			System.out.print(out + " ");
			return;
		}
		for(int i=start;i<=9;i++)
		{
			String str = out + Integer.toString(i);
			calcNum(i+1,str,num-1);
		}
	}

}
