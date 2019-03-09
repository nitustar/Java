package jprg;
import java.util.*;
class Num
	{
	public static void main(String args[])
		{
		int ar[]=new int[10];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter Any Integer : ");
		for(i=0;i<5;i++)
			{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
			}
		System.out.printf("\nSum of Integer = %d",sum);
		}
	}