import java.util.Scanner;

public class ReversePyramidStarPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*(i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
