import java.util.*;
public class Power
{
static int power(int m, int n)
{
    int k;
    if (n == 0)
        return 1;
    k = power(m, n / 2);
    if (n % 2 == 0)
        return k * k;
    else
        return m * k * k;
}
  public static void main (String[]args)
  {
Scanner s= new Scanner(System.in);
System.out.println("Enter the number nou want to find the power");
int n;
n=s.nextInt();
System.out.println("Enter the number power nou want to find for "+n);
int p;
p=s.nextInt();
System.out.println(power(n,p));
  }
}