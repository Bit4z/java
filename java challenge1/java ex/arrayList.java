import java.util.*;
class arrayList{
public static void main(String args[])
{
ArrayList list=new ArrayList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(7);
System.out.println(list);
System.out.println(list.get(0));
list.add("ziyaulhaq");
System.out.println("This way is represent traversing by for loop with size method..");
for(int i=0;i<list.size();i++)
{
System.out.println(list.get(i));
}
ArrayList <String>list1=new ArrayList<String>();
list1.add("ziyaulhaq");
list1.add("rizwan");
list1.add("vikram");
list1.add("yash chauhan");
list1.add("Ajay");
System.out.println("This elements belongs to list1");
System.out.println(list1);
System.out.println("\n");
System.out.println("This way is represent traversing by Iterator..");


Iterator it=list1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}



list.addAll(list1);
System.out.println("adding all element in list from list1");
System.out.println(list);


System.out.println("Treverse element by for each loop");
for(String obj:list1)
System.out.println(obj);


System.out.println("Traverse list in reverse order");
ListIterator <String>li=list1.listIterator(list1.size());
while(li.hasPrevious())
{
System.out.println(li.previous());
}



list.add(1,"1 position");
System.out.println(list);
}
}
