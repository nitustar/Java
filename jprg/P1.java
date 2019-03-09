package jprg;
import java.util.*;
class Prime
	{
	public static void main(String a[])
		{
		int x,i;
		double t;
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter any Integer : ");
		x=sc.nextInt();
		t=Math.sqrt(x);
		for(i=2;i<t;i++)
			{
			if(x%i==0)
				{
				System.out.printf("%d is not Prime no. ",x);
				break;
				}
			else
				{
				System.out.printf("%d is Prime no.",x);
				}
			
			}
		}
	}