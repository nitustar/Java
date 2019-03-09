package jprg;
import java.util.Scanner;
class AveTemp
	{
	double ar[]=new double[5]; double av,add=0; int i=0;
	AveTemp()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Temperature of 5 Cities : ");
		while(i!=5)
			{
			ar[i]=sc.nextInt();
			add=add+ar[i];
			i++;
			}
		av=add/5;
		System.out.printf("Average Temperature of Cites = %.2f",av);
		}
	public static void main(String args[])
		{
		AveTemp av=new AveTemp();
		}
	}
