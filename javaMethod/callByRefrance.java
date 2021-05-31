import java.util.*;
class callByRefrance{
int a;
int b;
callByRefrance(int x,int y)
{
a=x;
b=y;
}
void ChangeValue(callByRefrance obj)
{
obj.a=a+10;
obj.b=b+20;
}
public static void main(String args[])
{
callByRefrance object=new callByRefrance(10,20);
System.out.println("Value of a:"+object.a+"value of b"+object.b);
object.ChangeValue(object);
System.out.println("Value of a:"+object.a+"value of b"+object.b);
}
}
 