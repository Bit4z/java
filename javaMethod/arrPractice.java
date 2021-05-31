import java.util.*;
import java.util.ArrayList;
class arrPractice{
public static void main(String args[])
{
ArrayList ar=new ArrayList();
ar.add("ziya");
ar.add("khan");
ar.add("sofia");
System.out.println(ar);
Iterator itr=ar.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
ArrayList<String> ar1=new ArrayList<String>();
ar1.addAll(ar);
System.out.println(ar1);
for(String obj:ar1)
{
System.out.println(obj);
}
for(int i=0;i<ar1.size();i++)
{
System.out.println(ar1.get(i));
}
ListIterator itr1=ar1.listIterator(ar1.size());
System.out.println("reverse order");
while(itr1.hasPrevious())
{
System.out.println(itr1.previous());
}
}
}