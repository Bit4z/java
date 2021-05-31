import java.util.Scanner;
class commandLine{
public static void main(String args[])
{
if(args.length>0)
{
System.out.println("The command line"+"arguements are");
for(String s:args)
{
System.out.println(s);
}
}else
{
System.out.println("There is no arguement");
}
}
}