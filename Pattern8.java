//odd number pattern 
import java.util.Scanner;
class Pattern8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		int i,j;
		
		for(i=0; i<num; i++)
		{
			 int num1=1;
			for(j=0; j<num; j++)
			{
				
				if(j<num-i-1)
				{
					System.out.print(" "+" ");
				}
				else
				{
					System.out.print(num1+" ");
					
					num1=num1+2;
				}
			}
			System.out.println();
		}
	}
}
