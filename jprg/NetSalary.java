package jprg;
import java.util.Scanner;
class Salary
	{
	void netSalary(float b)
		{
		float da,hra,gs,ns,deduction;
		da=40f/100*b;
		hra=15f/100*b;
		gs=hra+da+b;
		deduction=2.5f/100*gs;
		ns=gs-deduction;
		System.out.printf("\nNet Salary = %.2f",ns);
		}
	public static void main(String args[])
		{
		float b;
		Salary s=new Salary();
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Basic Salary : ");
		b=sc.nextFloat();
		s.netSalary(b);
		}
	}