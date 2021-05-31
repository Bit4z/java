import java.util.*;
class creatingObjectDifferentWay{
String newObject()
{
return ("this is new keyword object");
}
String cloneObject()
{
return ("This is clone object");
}
String forName()
{
return ("this is class.forName Object");
}
public static void main(String args[])
{
creatingObjectDifferentWay obj=new creatingObjectDifferentWay();
creatingObjectDifferentWay obj1=new creatingObjectDifferentWay();
creatingObjectDifferentWay obj2=(creatingObjectDifferentWay)obj1.clone();
//creatingObjectDifferentWay obj3=(creatingObjectDifferentWay)Class.forName("com.p1.creatingObjectDifferentWay).newInstance();
System.out.println(obj.newObject());
System.out.println(obj2.cloneObject());
}
}