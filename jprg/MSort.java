import java.util.*;
class MergeSort
	{
	static void mSort(int ar[],int m,int left,int right)
		{
		int i,j,k;
		int n1=m-left+1;
		int n2=right-m;
		
		int lar[]=new int[n1];
		int rar[]=new int[n2];
		for(i=0;i<n1;++i)
			{
			lar[i]=ar[left+i];
			}
		for(j=0;j<n2;++j)
			{
			rar[j]=ar[m+1+j];
			}
			
		i=0;
		j=0;
		k=left;
		while(i<n1&&j<n2)
			{
			if(lar[i]<=rar[j])
				{
				ar[k]=lar[i];
				i++;
				}
			else
				{
				ar[k]=rar[j];
				j++;
				}
			k++;
			}
			
		while(i<n1)
			{
			ar[k]=lar[i];
			i++;
			k++;
			}
		while(j<n2)
			{
			ar[k]=rar[j];
			j++;
			k++;
			}
			
		}
		
	static void sort(int ar[],int l,int r)
		{
		int mid;
		if(l<r)
			{
			mid=(l+r)/2;
			sort(ar,l,mid);
			sort(ar,mid+1,r);
			mSort(ar,mid,l,r);
			}
		}
		
	public static void main(String a[])
		{
		int n,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter the no. of Integers : ");
		n=sc.nextInt();
		System.out.printf("\nEnter the Integers : ");
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
		for(i=0;i<n;i++)
			{
			System.out.println(arr[i]+" ");
			}
		sort(arr,0,n);
		System.out.println("");
		for(i=0;i<n;i++)
			{
			System.out.println(arr[i]+" ");
			}
		}
	}