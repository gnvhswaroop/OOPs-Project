import java.util.Scanner;
public class FindTarget
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	    int n,target;
	    int a[]=new int[100];
System.out.println("enter the size of the array");
	    n=s.nextInt();
System.out.println("enter the target to find its addition pair");
	    target=s.nextInt();
System.out.println("enter the elements into the array");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    FindTarget.findTarget(a,n,target);
	}
	static void findTarget(int a[],int n,int target)
	{
	    int result=0;
	    for(int j=0;j<n-1;j++)
	    {
	        result=target-a[j];
	        for(int k=j+1;k<n;k++)
	        {
	        if(result==a[k])
	        {
	        System.out.println(j+" "+k);
	        break;
	    }
	   
	}
	if(result>0)
	break;
	
}
}
}