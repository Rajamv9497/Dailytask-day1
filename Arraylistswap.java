import java.util.*;
import java.lang.*;
import java.io.*;

public class Arraylistswap
{
 public static void main(String args[])
 {
  int a,b;
  ArrayList<String> sw =new ArrayList<String>();
  System.out.println("enter the elements");
  Scanner sc =new Scanner(System.in);
  for(int i=0;i<5;i++)
  { 
   String j= sc.nextLine();
     sw.add(j);
  }
  System.out.println("enter the index locations that u need to swap");
  a=sc.nextInt();
  b=sc.nextInt();
  String temp=sw.get(a).toString();
  String temp1=sw.get(b).toString();
  sw.add(b,temp); 
  sw.remove(b+1);
   sw.add(a,temp1);
   sw.remove(a+1); 
  ListIterator itr=sw.listIterator();
  while(itr.hasNext())
      System.out.println(itr.next());
  }
} 