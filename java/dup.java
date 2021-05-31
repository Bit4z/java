import java.util.*;
public class dup{
public static Boolean cd(List a)
{
for(int i=0;i<a.size();i++)
{
for(int j=i+1;j<a.size();j++)
{
if(a.get(i)==a.get(j)){
return true;
}
}
}
return false;
}
public static void main(String args[])
{
List<Integer>mylist=List.of(1,2,3,4,5,3);
System.out.println(cd(mylist));
}
}