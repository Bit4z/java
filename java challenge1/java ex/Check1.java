class Point { 
     protected int x, y; 

  
    public void Point1(int _x, int _y) 
    { 
        x = _x; 
        y = _y; 
    } 
} 
class abc extends Point{
int a;
int b;
void cupe()
{
 System.out.println("i am from abc");
}
}
class temp{
public int z=30;
}
  
public class Check1 extends abc{ 
    public static void main(String args[]) 
    { 
        Check1 p = new Check1(); 
p.Point1(2,3);
p.a=9;
p.b=10;
        System.out.println("x = " + p.x + "y="+ p.y+"p.a"+p.a+"p.b"+p.b); 
    } 
} 