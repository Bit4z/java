import java.util.*;
public class Arlist1{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add("apna");
al.add("time");
al.add("ayega");
System.out.println("It is a simple array:"+al);
Iterator itr=al.iterator();
while(itr.hasNext())
{
System.out.println("\this is a iterator traversing:"+itr.next());
}
System.out.println("\n");
for(int i=0;i<al.size();i++)
{
System.out.println("This is a for loop traversing:"+al.get(i));
}
System.out.println("\n");


System.out.println("\n");
ArrayList al1=new ArrayList();
al1.add("ziya");
al1.add("khan");
al1.add(1,"mera bhai");
al1.addAll(al);
al1.add(4,"4 position");
//al1.remove("mera bhai");
System.out.println("This contain the second array list"+al1);

System.out.println("reverse order");
ListIterator list1=al.listIterator(al.size());
while(list1.hasPrevious())
{
//String str=list1.previous();
System.out.println(list1.previous());
}
}
}
