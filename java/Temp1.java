import java.util.Scanner;
import java.util.ArrayList;
class Temp1{
int id;
String name;
int marks;
Temp1(int id,String name, int marks)
{
this.id=id;
this.name=name;
this.marks=marks;
}
String getInfo()
{
return "id\t\t"+id+"name\t\t"+name+"marks\t\t"+marks;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList <Temp1>list=new ArrayList<Temp1>();
int c=0;

while(c!=7)
{
System.out.println("press 1 for add student\r\n"+
"press 2 for search a student by id\r\n"+
"press 3 for to get the marks student by id\r\n"+
"press 4 for to view all the student data\r\n"+
"press 5 for to delete a student by id\r\n"+
"press 6 for to change the name of the student by id\r\n"+
"press 7for exit the display\r\n");
c=sc.nextInt();
switch(c){
case 1:
System.out.println("enter student id:");
int id=sc.nextInt();
System.out.println("enter student name:");
String name=sc.next();
System.out.println("enter student marks:");
int marks=sc.nextInt();
list.add(new Temp1(id,name,marks));
break;
case 2:
System.out.println("enter student search id:");
int ID=sc.nextInt();
for(Temp1 s:list)
{
if(ID==s.id)
{
System.out.println(s.getInfo());
}
}
break;
case 3:
System.out.println("enter student searching marks for id:");
int ID1=sc.nextInt();
for(Temp1 s:list)
{
if(ID1==s.id)
{
System.out.println(s.marks);
}
}
break;
case 4:
for(Temp1 T:list)
{
System.out.println(T.getInfo());
}
break;
case 5:
System.out.println("enter student search id:");
int ID2=sc.nextInt();
for(Temp1 s:list)
{
if(ID2==s.id)
{
list.remove(s);
}
}
break;
case 6:System.out.println("enter student search id:");
int ID3=sc.nextInt();
for(Temp1 s:list)
{
if(ID3==s.id)
{
s.name=sc.next();

}
}
break;
case 7:System.out.println("Thanks for visiting here bye bye");
break;
default:System.out.println("please enter write key");
break;
}
}
}
}




