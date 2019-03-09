package jprg;
import java.util.Scanner;
class DecToBin
	{
	DecToBin()
		{
		int n,t=0; int x[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		n=sc.nextInt();
		while(n!=0)
			{
			x[t]=n%2;
			n=n/2;
			t++;
			}
		t--;
		while(t>=0)
			{
			System.out.printf("%d",x[t]);
			t--;
			}
		}
	public static void main(String args[])
		{
		BinaryConversion BCon=new BinaryConversion();
		}
	}