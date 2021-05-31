import java.util.*;
import java.io.IOException;
class javaException{

public static int devideByZero(int a,int b)
{

int c=a/b;

return c;

}


public static void main(String args[])
{
javaException obj=new javaException();
String str=new String();
System.out.println("the value is="+str);
String str1=null;
//System.out.println(str1.length()); NullPointer exception
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a=");
int a=sc.nextInt();
System.out.println("enter the value of b=");
int b=sc.nextInt();

try
{
System.out.println("The division ="+javaException.devideByZero(a,b));
}
catch(ArithmeticException e)
{
System.out.println("plz dont enter 0 of b:=");
}

int arr[]=new int[4];
try
{
System.out.println(arr[4]);
}
catch(ArrayIndexOutOfBound e)
{
System.out.print(e.getMessage());
}
}
}