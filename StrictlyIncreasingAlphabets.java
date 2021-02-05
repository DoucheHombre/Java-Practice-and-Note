import java.util.Scanner;
public class StrictlyIncreasingAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		
		printSIA(65," ",n);
	}
	public static void printSIA(int start,String out,int num)
	{
		if(num == 0)
		{
			System.out.println(out+" ");
			return;
			
		}
		for(int i=start;i<=90;i++)
		{
			String str = out + Character.toString((char)i);
			printSIA(i+1,str,num-1);
		}
	}

}
