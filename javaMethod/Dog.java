public class Dog{
String name;
String breed;
int age;
String color;
public Dog(String name,String breed,int age,String color)
{
this.name=name;
this.breed=breed;
this.age=age;
this.color=color;
}
public String getName()
{
return this.name;
}
public String getBreed()
{
return this.breed;
}
public int getAge()
{
return this.age;
}
public String getColor()
{
return this.color;
}
public String toString()
{
return ("This is name="+ this.getName()+ "        "+ "this is breed=" +this.getBreed()+ "       "+"this is age="+ this.getAge()+ "       "+ "This is color="+this.getColor());
}
public static void main(String args[])
{
Dog tuffy=new Dog("tommy","hungry",12,"black");
System.out.println(tuffy.toString());
}
}
