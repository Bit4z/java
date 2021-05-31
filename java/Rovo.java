import java.util.*;
class Rovo{
public static void main(String args[])
{
List<String>strList=new ArrayList<>();
strList.add("ziya");
strList.add("shivang");
strList.add("sharad");
strList.add("vikash");
strList.add("rencho");
System.out.println(strList);
System.out.println("this is a for loop");
for( String s:strList)
{
System.out.println(s);
}
Iterator<String> it=strList.iterator();
System.out.println("this is iterator");
while(it.hasNext()){
//String obj=it.next();
System.out.println(it.next());
}

}

}