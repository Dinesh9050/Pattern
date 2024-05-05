import java.util.Scanner;

public class LeftAngledTriangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=2*(a-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
