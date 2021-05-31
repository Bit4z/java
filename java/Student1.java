import java.util.Scanner;
class Student1{
int uid;
String name;
long marks;
public void setInfo(int uid,String name, long marks)
{
this.uid=uid;
this.name=name;
this.marks=marks;
}
public void getInfo()
{
System.out.println(uid+"\t\t"+name+"\t\t"+marks);
}

public static void main(String args[])
{
Student1 st=new Student1();
Scanner ob=new Scanner(System.in);
System.out.println("enter no of student:=");
int n=ob.nextInt();
Student1  arr[]=new Student1[n];
for(int i=0; i<n;i++)
{
System.out.println("enter the student id");
int uid=ob.nextInt();
System.out.println("enter the student name");
String name=ob.next();
System.out.println("enter the student marks");
int marks=ob.nextInt();
st.setInfo(uid,name,marks);
arr[i]=st;
}
ob.close();
for(int i=0;i<arr.length;i++)
{
arr[i].getInfo();
System.out.println(arr[i].uid+"i="+i);
}
}
}

