import java.util.Scanner;
class Check{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter then number of an array=");
int n,k=0,sum=0,f=0;
int a[]=new int[100];
n=obj.nextInt();
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]==6)

{
while(a[i]!=7&&i!=n)
{
k=k+a[i];
i=i+1;
f=k;
if(a[i]==7)
{
k=0;


}
}
}
else
{
sum=sum+a[i];
}
}
System.out.println("the total sum is:="+(sum+k));
}}

