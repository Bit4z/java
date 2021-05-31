import java.util.Scanner;
import java.lang.String;

class Devi{
public static void main(String args[])
{
String a[]=new String[50];
String b[]=new String[50];
String m;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of entry");
int n=sc.nextInt();
System.out.println("Enter the student name");
for(int i=0;i<=n;i++)
{
a[i]=sc.nextLine();
}
System.out.println("printing array element");
for(int i=0;i<=n;i++)
{
System.out.print("\t"+a[i]);
}
System.out.println(" ");
int j=0;
for(int i=n;i>=0;i--)
{
b[j]=a[i];
j++;
}
for(int i=0;i<=n;i++)
{
a[i]=b[i];
}
System.out.println("printing array element after reversing order in original array");
for(int i=0;i<=n;i++)
{
System.out.print("\t"+a[i]);
}

}
}