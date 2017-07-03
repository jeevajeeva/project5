# project
import java.io.*;
import java.util.*;
public class Vowels
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    //String str=sc.nextLine();
    char s;
    s=sc.next().charAt(0);
    if(((s=='a')||(s=='e')||(s=='i')||(s=='o')||(s=='u')) ||(s=='A')||(s=='E')||(s=='I')||(s=='O')||(s=='U'))
    {
      System.out.println("vowels");
    }
    else
    {
      System.out.println("constant");
    }
  }
}
