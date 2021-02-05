import java.util.Scanner;
public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of disks = ");
		int disk = sc.nextInt();
		printTOH(disk,'A','C','B');
	}
	
	public static void printTOH(int disk,char from,char to,char aux)
	{
		if(disk==1)
		{
			System.out.println("Move disk 1 from rod "+from+" to rod "+to);
			return;
		}
		else {
			printTOH(disk-1,from,aux,to);
			System.out.println("Move disk "+disk+" from rod "+from+" to rod "+to);
			printTOH(disk-1,aux,to,from);
		}
	}

}
