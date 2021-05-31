import java.util.*;
import java.util.Scanner;
//import java.ArrayList.*;
class Employee{
int Sr;
String Id;
String Desk;
Employee(int Sr, String Id, String Desk)
{
this.Sr=Sr;
this.Id=Id;
this.Desk=Desk;
}
public String getInfo()
{
return (Sr+":\t\t"+Id+":\t\t"+Desk+"\n");
}

public static void main(String args[])
{
ArrayList<Employee> list=new ArrayList<Employee>();
System.out.println("enter the number of data");
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
Employee arr[] = new Employee[n];

for(int i=0;i<n;i++)
{
System.out.println("enter the Sr number");
int sr=sc.nextInt();
System.out.println("enter the id number");
String id=sc.next();
System.out.println("enter laptop");
String desk=sc.next();
Employee em=new Employee(sr,id,desk);
list.add(em);
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i].getInfo());
}
}
}