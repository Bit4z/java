import java.util.Scanner;
class Num{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n;
System.out.println("enter the number length of an array:");
n=obj.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
int s,m;
s=a[0];
for(int i=0;i<n;i++)
{
if(a[i]<s)
{
s=a[i];
}
}
m=a[0];
for(int i=0;i<n;i++)
{
if(a[i]>m)
{
m=a[i];
}
}
System.out.println("the smallest number is="+s);
System.out.println("the largest number is="+m);
}
}