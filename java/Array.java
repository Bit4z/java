import java.util.Scanner;
public class Array{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of an array=");
int n;
int a[]=new int[20];
int i,c=0,k;
n=obj.nextInt();
System.out.println("Arra list");
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
System.out.println(a[i]);
}
System.out.println("enter the value for checking the number");
k=obj.nextInt();
for(i=0;i<n;i++)
{

if(a[i]==k)
{
c=i+1;
System.out.println("The number is exist at the position="+c);
}
}
if(c==0)
{
int f=-1;
System.out.println("The number is not exist"+f);
}
}
}