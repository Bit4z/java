import java.util.*;
class methodOver{
int add(int a,int b)
{
int sum=a+b;
return sum;
}
Double add(int a,int b)
{
Double sum=a+b+0.0;
return sum;
}
public static void main(String arg[])
{
methodOver obj=new methodOver();
System.out.println(obj.add(12,13));
System.out.println(obj.add(20,30));
}
}

