package jprg;
import java.util.Scanner;
class Employee
	{
	int emp_no,emp_sal;
	String emp_name,emp_dep;
	public void accept()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter Employee no. : ");
		emp_no=sc.nextInt();
		System.out.print("\n Enter the Name of Employee : ");	
		emp_name=sc.next();
		System.out.print("\n Enter the Department of Empployee : ");
		emp_dep=sc.next();
		System.out.print("\n Enter the Employee Salary : ");
		emp_sal=sc.nextInt();
		System.out.print("\n Details are Inserted !!");
		}
	public void display()
		{
		System.out.printf("\n Employee no. = %d",emp_no);
		System.out.printf("\n Employee Name = %s",emp_name);
		System.out.printf("\n Employee Department = %s",emp_dep);
		System.out.printf("\n Employee Salary = %d",emp_sal);
		}
	public static void main(String args[])
		{
		Employee em=new Employee();
		em.accept();
		em.display();
		}
	}
