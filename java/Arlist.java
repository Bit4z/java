
import java.util.*;
public class Arlist{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList();
al.add("ziya");
al.add("shivang");
al.add("updesh");
al.add("farman");
System.out.println("The arraylist is:"+al);
Iterator itr=al.iterator();
while(itr.hasNext())
{
System.out.println("The output through iterator:"+itr.next());
}
for(int i=0;i<al.size();i++)
{
System.out.println("The output through for loop:"+al.get(i));
}
for(String obj:al)  
    System.out.println("It is best way representing the loop:"+obj); 
ListIterator<String> list1=al.listIterator(al.size());
while(list1.hasPrevious())
{
String str=list1.previous();
System.out.println("the reverse string is:"+str);
}
}
}