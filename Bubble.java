import java.util.Scanner;
class Bubble{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[100];
int temp;
System.out.println("enter the number of sort");
int n=sc.nextInt();
int i,j;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The sorting array:");
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}}

