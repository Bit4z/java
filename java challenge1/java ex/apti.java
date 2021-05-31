import java.util.Scanner;
class apti
{
public static void main(String args[])
{
 apti obj=new apti();
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
String u=checknumber(n);
System.out.println(u);
}
static String checknumber(int a)
{
if(a>0)
{
return "A is positive";
}
else if(a<0)
{
return "a is nagetive";
}
else{
return " a is zero";
}
}
}

