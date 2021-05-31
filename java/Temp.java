import java.util.Scanner;
import java.util.ArrayList;
class Temp{
int id;
String name;
int marks;
public void set(int id,String name, int marks)
{
this.id=id;
this.name=name;
this.marks=marks;
}
public String get()
{
return id+"\t\t"+name+"\t\t"+marks;
}
public static void main(String args[])
{
Temp ob=new Temp();
Temp obj=new Temp();
ArrayList <Temp>list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("enter the student of data");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("enter ID");
int id=sc.nextInt();
System.out.println("enter name");
String name=sc.next();
System.out.println("enter ID");
int marks=sc.nextInt();
ob.set(id,name,marks);
list.add(ob);
}
System.out.println("student data");
for(int i=0;i<n;i++)
{
System.out.println();
}
}
}



