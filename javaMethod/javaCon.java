import java.util.*;
class javaCon{
int id;
String name;
int age;
int roll;
int a; int b;
String xyz;
int idx;
javaCon(String xyz,int idx)
{
this.xyz=xyz;
this.idx=idx;
System.out.println(xyz);
System.out.println(idx);
}
void fun(int x,int y)
{
a=x;
b=y;
}
javaCon(int id,String name)
{
this.id=id;
this.name=name;
}
javaCon(int x,int y)
{
age=x;
roll=y;
}
javaCon(javaCon abc)
{
System.out.println("This is copy constructer");
System.out.println(abc.xyz);
System.out.println(abc.idx);
}
public static void main(String args[])
{
javaCon obj=new javaCon(1307,"Ziyaulhaq");
javaCon obj1=new javaCon(18,1742);
javaCon obj2=new javaCon("ABC",8382);
javaCon obj3=new javaCon(obj2);
javaCon obj4=obj3;
System.out.println(obj4.xyz);
System.out.println(obj4.idx);

obj1.fun(12,13);
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj1.age);
System.out.println(obj1.roll);
System.out.println(obj1.a);
System.out.println(obj1.b);
System.out.println(obj2.xyz);
System.out.println(obj2.idx);
}
}