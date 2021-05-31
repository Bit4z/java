import java.util.*;
class doWhile{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number size of an");
int n=sc.nextInt();
do
{
System.out.println("if you want to exit your task press 0:");
n=sc.nextInt();
}
while(n!=0);
System.out.println("Enter the Size of arraylist elements");
int x=sc.nextInt();
ArrayList <Integer> ar=new ArrayList<>();
for(int i=0;i<x;i++)
{
ar.add(i);
}
System.out.print(ar);
}
}