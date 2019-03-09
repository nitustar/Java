// Method overloading

class AddOverloading
	{
	Static int add(int a, int b)
		{
		return a+b;
		}
	Static double add(double a, double b)
		{
		return a+b;
		}
	public static void main(String a[])
		{
		System.out.println(Adder.add(12,22));
		System.out.println(Adder.add(12.5,22.5));
		}
	}
		