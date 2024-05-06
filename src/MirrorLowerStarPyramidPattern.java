import java.util.Scanner;

public class MirrorLowerStarPyramidPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=a-1;k>=0;k--)
		{
			for(int l=0;l<k;l++)
			{
				System.out.print(" ");
			}
			for(int l=k;l<a;l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
