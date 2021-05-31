import java.util.*;
import java.util.Scanner.*;

class Str{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

String arr[]={"ziya","khan","abhishek","bhanu","akhi"};
 Arrays.sort(arr);
System.out.println("Array is sorting:");
for(int i=0;i<arr.length;i++)
{

System.out.println(arr[i]);
}

System.out.println("enter first string");
String n=sc.nextLine();
System.out.println("enter second string");
String m=sc.nextLine();
if(n.equals(m))
{
System.out.println("return:"+"0");

}
else if(n.length()>m.length())
{
System.out.println("return:"+"1");
}
else
{
System.out.println("return:"+"-1");
}




}

}