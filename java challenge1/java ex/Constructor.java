package constructor;
import java.util.Scanner;
public class Constructor
{
     String name ;
      int emp_id;
      static int g;
      static String c;
      int o;
      String gender;
      Constructor(String nam  , int emp_i) //parametrized constructor
      {
    	  this.name = nam;
    	  this.emp_id = emp_i;
      }
	public static void main(String[] args) 
	{
		Constructor obj1 = new  Constructor("priti",1221); // object of parameterized constructor
		Constructor obj2 = new  Constructor("sakshi",121);// object of parameterized constructor
		Constructor obj3 = new  Constructor("twinkle",221);// object of parameterized constructor
		Constructor obj4 = new  Constructor("lovely",1);// object of parameterized constructor
		System.out.println("name is-> " + obj1.name+ " employee id is-> " +obj1.emp_id);
		System.out.println("name is->" + obj2.name+ " employee id is->" +obj2.emp_id);
		System.out.println("name is->" + obj3.name+ " employee id is->" +obj3.emp_id);
		System.out.println("name is->" + obj4.name+ " employee id is-> " +obj4.emp_id);
		ram obj5 = new ram();
		priti obj6 = new priti();
        obj6.sakshi();
        twinkle obj7 = new twinkle();
    	System.out.println("value of a is->" + obj7.u+ " value of b  is-> " +obj7.k);
    	lovely u = new lovely();
    	u.show();
        // static variable
    	//constructor obj19 = new Constructor();
    	g =8;
    	c ="sumit";
		System.out.println("value of g is->" + g+ " value of c is-> " +c);
    	//constructor obj20 = new Constructor();
    	g =64;
    	c ="abhi";
		System.out.println("value of g is->" + g+ " value of c is-> " +c);
		
		//instance variable
		//Constructor obj9 = new Constructor("ziya",234);
		obj1.o= 1 ;
	    obj1.gender = "ziya";
		System.out.println("value of g is->" +obj2.name+ " value of c is-> " +obj2.gender);

		//Constructor obj10 = new Constructor("abdul",432);
		obj2.o= 90 ;
	    obj2.gender = "abdul";
		System.out.println("value of g is->" +obj1.name+ " value of c is-> " +obj1.gender);
	}

}
class ram{
	ram()  // no argument constructor
	{
		System.out.println("no argument constructor");
	}
}
class priti
{  
	int a =10;
	String b = "raman";
	void sakshi()
	{
	System.out.println("value of a is->" + a+ " value of b  is-> " +b);
	}
}
class twinkle
{    //default constructor
	int u = 90;
	String k ="twinkle";
}
class lovely
{
	void show()
	{
	Scanner oj = new Scanner(System.in);
	System.out.println("number is");
	int num = oj.nextInt();
	System.out.println("enter u value");
	int  u = oj.nextInt();
	oj.nextLine();
	System.out.println("school name is");
	String  school = oj.nextLine();
	System.out.println("school name is");
	String  college = oj.nextLine();
	System.out.println("number is->" +num+ "int number is-> " +u+ "school name is" +school+ "college  name is" +college);
	}
}