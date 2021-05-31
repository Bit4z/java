class A1{
int a;
int b;
void fun()
{
System.out.println("i am from class A");
}
}
class B1{
void fun2()
{
System.out.println("i am from class B");
}
public static void main(String args[])
{
A1 obj=new A1();
B1 obj2= new B1();
obj.fun();
obj2.fun2();
}
}