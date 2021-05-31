import java.util.Scanner;
class Test{
String name;
int uid;
int marks;
void getinfo(int u,String n, int m){
uid=u;
name=n;
marks=m;
}
void display(String nx,int mx,int ux)
{
System.out.println("name="+nx);
System.out.println("marks="+mx);
System.out.println("uid="+ux);
}
public static void main(String args[])
{
Test obj=new Test();
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
System.out.println("enter the data of student=:");
int n;
int U;
String N;
int M;
n=sc.nextInt();
int u[]=new int[100];
String s[]=new String[100];
int m[]=new int[100];
for(int i=0;i<n;i++)
{
System.out.println("Student uid=:");
u[i]=sc1.nextInt();
System.out.println("student name=:");
s[i]=sc2.nextLine();
System.out.println("student marks=:");
m[i]=sc3.nextInt();
obj.getinfo(u[i],s[i],m[i]);

}
for(int i=0;i<n;i++)
{
obj.display(s[i],m[i],u[i]);
}
}
}
