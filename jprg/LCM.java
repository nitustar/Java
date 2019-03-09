package jprg;
import java.util.Scanner;
class LCM
	{
	public static void main(String args[])
		{
		int a,b,i,lcm=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter any 2 Integer : ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
			i=a;
		else
			i=b;

		while(1==1)
			{
			if(i%a==0 && i%b==0)
				{
				lcm=i;
				break;
				}
			i++;
			}
		System.out.printf("\n%d",lcm);
		}
	}	