import java.util.*;
import java.lang.*;

public class stringcount
{
  public static void main(String args[])
  {
    String s;
    System.out.println("Enter the string");
    Scanner sc =new Scanner(System.in);
    s=sc.nextLine();
    String s1[]=s.split(" ");
    System.out.println(s1.length);
  }
}