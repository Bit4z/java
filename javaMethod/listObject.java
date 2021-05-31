import java.util.*;
class listObject{
public static List<Object>getDetails(){
String Name="Ziya";
int age=23;
char ch='M';
return Arrays.asList(Name,age,ch);
}
public static void main(String arg[])
{
List<Object> Person=getDetails();
System.out.println(Person);
}
}