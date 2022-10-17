import java.util.Scanner;
public class MaxProfit
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[100];
	int n;
System.out.println("enter the size of the array");
	n=s.nextInt();
System.out.println("enter the elements into the array");
	for(int i=1;i<=n;i++)
	{
	    a[i]=s.nextInt();
	}
	MaxProfit.printMax(a,n);
	}
	static void printMax(int a[],int n)
	{
	int max=a[1],tmp,i,j=1;
	for(i=2;i<=n;i++)
	{
	    if(max<a[i])
	    {
	        j=i;
	        max=a[i];
	    }
	
	}
	System.out.print(max);
	if(n>1)
	{
	    tmp=a[n];
	   a[n]=a[j];
	   a[j]=tmp;
	   n--;
	   printMax(a,n);
	}
}
}
