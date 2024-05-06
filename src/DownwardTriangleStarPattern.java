import java.util.Scanner;

public class DownwardTriangleStarPattern {

	public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           int a=in.nextInt();
           for(int i=a-1;i>=0;i--)
           {   	   
        	   for(int j=0;j<=i;j++)
        	   {
        		   System.out.print("* ");
        	   }
        	   System.out.println();
           }
	}

}
