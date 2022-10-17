import java.io.*;
import java.util.Scanner;
class CheckPalindrome
{
    static boolean isPalindrome(String str,
                            int start, int end)
    {
        if (start == end)
            return true;
        if ((str.charAt(start)) != (str.charAt(end)))
            return false;
        if (start < end + 1)
            return isPalindrome(str, start + 1, end - 1);
  return true;
    }

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        String str;
System.out.println("enter the string to check palindrome");
 str=s.nextLine();
  int n = str.length();
        if (isPalindrome(str,0,n-1))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
 