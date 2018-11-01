import java.util.*;
import java.io.*;
import java.lang.*;

public class Arraylistcompare
{
 public static void main(String args[])
 {
    ArrayList<String> sw1 =new ArrayList<String>();
   ArrayList<String> sw2 =new ArrayList<String>();
   ArrayList<String> sw3 =new ArrayList<String>();  
  Scanner sc =new Scanner(System.in); 
 System.out.println("enter the elements in the first list");
   for(int i=0;i<5;i++)
  { 
   String j= sc.nextLine();
     sw1.add(j);
  }
  System.out.println("enter the elements in the second list"); 
 
  for(int i=0;i<5;i++)
  { 
   String j= sc.nextLine();
     sw2.add(j);
  }
for(int i=0;i<5;i++)
{  
  String temp=sw1.get(i).toString();
  String temp1=sw2.get(i).toString();
   if(temp.equals(temp1))
        sw3.add("yes");
   else 
         sw3.add("no");
   }
   System.out.println("Final result is");
   
  ListIterator itr=sw3.listIterator();
  while(itr.hasNext())
      System.out.println(itr.next());
   }
}