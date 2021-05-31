import java.util.Scanner;
class Disc{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n,d,a;
System.out.println("enter the price=");
n=obj.nextInt();

System.out.println("enter the discount=");
d=obj.nextInt();
a=n*d/100;
System.out.println("The actual price is="+(n-a));
}}