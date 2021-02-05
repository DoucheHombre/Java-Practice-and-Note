import java.util.Scanner;
public class StruingPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word= ");
		String word = sc.next();
		int len = word.length();
		printPerm(word,0,len);
	}
	public static void printPerm(String word,int start,int length)
	{
		if(start == length)
		{
			System.out.println(word);
			return;
		}
		for(int i=start;i<length;i++)
		{
			word = swap(word,start,i);
			printPerm(word,start+1,length);
			word = swap(word,start,i);
		}
	}
	public static String swap(String word,int i,int j)
	{
		char ch[]=word.toCharArray();
		char b=ch[i];
		ch[i]=ch[j];
		ch[j]=b;
		return String.valueOf(ch);
	}
}
