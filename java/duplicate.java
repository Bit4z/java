import java.util.Scanner;
public class duplicate{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of an array=");
int n;
int a[]=new int[20];
n=obj.nextInt();
int i,c=0;
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
System.out.println("it is here to duplicate value:"+a[j]);
c++;
}
}
}
if(c==0)
{
System.out.println("it is here to not duplicate value:");
}
}
}
