import java.util.*;
import java.lang.*;

public class Middlechar
{
  public static void main(String args[])
  {
    String s;
    Scanner sc =new Scanner(System.in);
    s=sc.next();
    char ch[]=s.toCharArray();
    int len=ch.length;
    if(len%2==0)
        System.out.println(ch[(len/2)-1]);
   else
        System.out.println(ch[(len/2)]);
  }
}