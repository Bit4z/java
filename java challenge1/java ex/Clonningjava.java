import java.lang.Cloneable;
class Clonningjava implements Cloneable{
int i;
int j;
Clonningjava(int i,int j){
this.i=i;
this.j=j;
}
public static void main(String args[])throws CloneNotSupportedException
{
Clonningjava t1=new Clonningjava(10,20);
Clonningjava t2=(Clonningjava)t1.clone();
t2.i=888;
t2.j=999;
System.out.println(t1.i+","+t1.j);
}
}