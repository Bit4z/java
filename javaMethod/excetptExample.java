import java.util.*;
import java.io.IOException;
class excetptExample{
void div(int x,int y)
{

int sum=x/y;
System.out.println("sum="+sum);
}

public static void main(String args[])
{
excetptExample obj=new excetptExample();
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of a=");
int a=sc.nextInt();
System.out.println("Enter the number of b=");
int b=sc.nextInt();
try{
obj.div(a,b);

}
catch(Exception e)
{
System.out.println("avoid zero");
}
//<!-----------------------------------------------------Null pointer exception--------------------------------------------------------!>

String str=null;
try
{
System.out.println(str.charAt(0));
}
catch(NullPointerException e)
{
System.out.println("you can't put the value null inside ");
}

//<!-----------------------------------------------------String index out of bound exception--------------------------------------------------------!>

 try {
            String ab = "This is like chipping "; // length is 22
            char c = ab.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
try
{
int num=Integer.parseInt("akki");
System.out.print(num);
}
catch(NumberFormatException e)
{
System.out.print("NumberFormatException e");
}
}
}