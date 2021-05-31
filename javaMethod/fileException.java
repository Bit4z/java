import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
class fileException{
public static void main(String args[])
{
PrintWriter pw;
try
{
pw=new PrintWriter("returnArray1.txt");
pw.println("saved");
}
catch(Exception e) {  
              
            System.out.println(e);  
        }         
{
System.out.println("file execute successfully...");
}
}
}