package jprg;
import java.util.Scanner;
class Product
	{
	public int pid,price,quantity;
	public String pnm,brand,unit;
	Product()
		{
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter the Id of the Product : ");
   		pid=sc.nextInt();
		System.out.printf("\nEnter the Name of the Product : ");
		pnm=sc.next();
		System.out.printf("\nEnter the Brand of the Product : ");
		brand=sc.next();
		System.out.printf("\nEnter the Price of the Product : ");
		price=sc.nextInt();
		System.out.printf("\nEnter the Unit of the Product : ");
		unit=sc.next();
		System.out.printf("\nEnter the Quantity of the Product : ");
		quantity=sc.nextInt();
		}
	public void sell()
		{	
		}
	public void purchase()
		{
		}
	public void searchId()
		{
		}
	public void searchName()
		{
		}
	public void display()
		{
		System.out.printf("\n%3d%5s%5s%5d%5d%5d",pid,pnm,brand,price,unit,quantity);
		}
	}