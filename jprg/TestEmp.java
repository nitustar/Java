package jprg;
import java.util.Scanner;
import static java.lang.System.*;
class Emp
	{
	String n;
	String dpt;
	int s;
	Emp(String x,String y, int z)
		{
		n=x;
		dpt=y;
		s=z;
		out.printf("\nOne record created successfully !");
		}
	void display()
		{
		System.out.printf("\nName: %s, Department : %s, Salary : %d",this.n,dpt,s);
		}
	}
	
class TestEmp
	{
	public static void main(String args[])
		{
		Emp arr[]=new Emp[5];
		int i,z;
		String x,y;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
			{
			System.out.printf("\nEnter the Name, Department and Salary of the Employee : ");
			x=sc.next();
			y=sc.next();
			z=sc.nextInt();
			arr[i]=new Emp(x,y,z);
			}
		for(i=0;i<5;i++)
			{
			arr[i].display();
			}
		}
	}