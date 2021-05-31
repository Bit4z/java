import java.util.*;
class Bike1{
void run()
{
System.out.println("vihycle is running");
}
private void show()
{
System.out.println("Bike1 method");
}
}
class Bike2 extends Bike1{
void run()
{
System.out.println("Bike is running Safely");
}
void show()
{
System.out.println("Bike2 method");
}
public static void main(String args[])
{
Bike1 obj=new Bike2();
Bike1 obj1=new Bike1();
Bike2 obj2=new Bike2();
obj1.run();
obj.run();
obj2.show();
//obj1.show();
}
}
