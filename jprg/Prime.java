package jprg;
class Prime
	{
	Prime()
		{
		int i,n=1;
		while(n!=20)
			{
			n++;
			for(i=2;i<n;i++)
				{
				if(n%i==0)
					{
					System.out.printf("\n%d Not Prime Number",n);
					break;
					}
				}
			if(i==n)
				{
				System.out.printf("\n%d Prime Number",n);
				}
			}
		}
	public static void main(String args[])
		{
		Prime p=new Prime();
		}
	}