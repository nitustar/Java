package jprg;
import java.util.Scanner;
class Employee
	{
	public static void main(String args[])
		{
		String n[]=new String[10];
		String dpt[]=new String[10];
		int s[]=new int[10]; int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
			{
			System.out.printf("\nEnter the Name, Department and Salary of the Employee : ");
			n[i]=sc.next();
			dpt[i]=sc.next();
			s[i]=sc.nextInt();
			}
		for(i=0;i<10;i++)
			{
			System.out.printf("\nName: %s, Department : %s, Salary : %d",n[i],dpt[i],s[i]);
			}
		}
	}