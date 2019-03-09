package jprg;
import java.util.Scanner;
import static java.lang.System.*;
class Emp
	{
	static String n[]=new String[5];
	static String dpt[]=new String[5];
	static int s[]=new int[5]; 
	static int pos;
	Emp(String x,String y, int z,int i)
		{
		pos=i;
		n[pos]=x;
		dpt[pos]=y;
		s[pos]=z;
		out.printf("\nOne record created successfully !");
		}
	void display()
		{
		for(pos=0;pos<5;pos++)
			{
			System.out.printf("\nName: %s, Department : %s, Salary : %d",n[pos],dpt[pos],s[pos]);
			}
		}
	}
	
class TestEmp
	{
	public static void main(String args[])
		{
		Emp arr=new Emp();
		int i,z;
		String x,y;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
			{
			System.out.printf("\nEnter the Name, Department and Salary of the Employee : ");
			x=sc.next();
			y=sc.next();
			z=sc.nextInt();
			Emp(x,y,z,i);
			}
		arr.display();
		}
	}