import java.applet.Applet;
import java.awt.*;
public class awtDemo extends Applet{
public void initI()
{
setLayout(new FlowLayout(FlowLayout.center));
Label r1=new Label("Register form");
Label n=new Label("Name");
Label addr=new Label("address");
Label g=new Label("Gender");
Label j=new Label("Job");
Label f=new Label("Father Name");
TextField t1=new  TextField(20);
TextField t3=new  TextField(20);
TextField t3=new  TextField(20);
Choice cl=new Choice();
cl.add("male");
cl.add("female");
CheckboxGroup cbg=new CheckboxGroup();
Checkbox c1=new Checkbox("Exicutive",cbg,false);
Checkbox c2=new Checkbox("Manager",cbg,false);
Button b1=new Button("Reset");
Button b2=new Button("Register");
add(r1);
add(n);
add(t1);
add(f);
add(t2);
add(addr);
add(t3);
add(g);
add(cl);
add(j);
add(c1);
add(c2);
add(b1);
add(b2);
}
}
