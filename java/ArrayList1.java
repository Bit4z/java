import java.util.Scanner;
import java.util.ArrayList;
class ArrayList1{
public static void main(String args[])
{
ArrayList <String>list=new ArrayList<String>();
list.add("ziya");
list.add("amanpreet kaur");
list.add("updesh");
System.out.println("this is the list"+list);
for(String ls:list)
{
System.out.println("this is the list"+ls);
}

System.out.println("this is the list size="+list.size());
for( int i=0;i<list.size();i++)
{
System.out.println("this is the for loop"+list.get(i));
}
}
}