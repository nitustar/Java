import java.util.*;
class RepeatStr
	{
	public static void main(String a[])
		{
		int i=0;
		char t1='\0';
		String rep="";
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		while(i<str.length())
			{
			char t=str.charAt(i);
			if(t==t1)
				{
				rep=rep+t;
				}
			
			
			t1=str.charAt(i);
			i++;
			}
		System.out.printf("Reverse String is %s",rep);
		}
	}