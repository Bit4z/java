import java.util.Scanner;
import java.util.*;
class copyArray{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={10,11,12,13,14,17,18,19,20,21,22,23,24};
int b[]=Arrays.copyOf(a,4);
int c[]=Arrays.copyOfRange(a,2,7);
System.out.println("this is b array elements:");
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
System.out.print("This is c array elements:");
for(int i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
}