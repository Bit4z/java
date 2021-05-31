import java.util.Scanner;
class arrayOfObject{
int roll;
String name;
arrayOfObject(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of data=");
int n=sc.nextInt();
arrayOfObject arr[]=new arrayOfObject[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the name=");
String na=sc.next();
System.out.println("Enter roll number=");
int r=sc.nextInt();
arr[i]=new arrayOfObject(r,na);
}
System.out.println("the student data is:");
for(int i=0;i<arr.length;i++)
{
System.out.println("Element at:"+i+":"+arr[i].roll+"      "+arr[i].name);
}
}
}
