import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
class HashMap2{
public static void main(String args[])
{
HashMap<String,Long> ContactList=new HashMap();
Scanner sc=new Scanner(System.in);

int ch=0;
while(ch!=5)
{
System.out.println("press 1 for add the contact and name\n"+"press 2 for key exist or not\n"+"press 3 for check particular Value exist or not\n"+"press 4 for enhaces loop iterator\n"+"press 5 for close the window\n");
System.out.println("enter the choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("What number of data  do you want to add=");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("please enter the name");
String key=sc.next();
System.out.println("please enter the phone=");
Long val=sc.nextLong();
ContactList.put(key,val);
}
break;
case 2:
int c=0;
System.out.println("enter the Name for check existing or not");
String k=sc.next();
System.out.println("this is"+k);

for(Map.Entry<String, Long>hmaps: ContactList.entrySet())
{
//System.out.println("key="+hmaps.getKey());
if(k==hmaps.getKey())
{
c=1;
System.out.println("The value is exist="+hmaps.getKey());
}
}
if(c==0)
{
System.out.println("The key is not exist");
}

break;
case 3:
int d=0;
System.out.println("enter the phone check for existing or not");
Long v=sc.nextLong();
int y=0;
for(Map.Entry<String, Long>hmaps: ContactList.entrySet())
{
if(v==hmaps.getValue())
{
y=1;
System.out.println("The value is exist="+hmaps.getValue());
}
}
if(y==0)
{
System.out.println("The phone is not exist");
}

break;
case 4:
for(Map.Entry<String, Long>hmaps: ContactList.entrySet())
{
System.out.println(hmaps.getKey()+" :"+hmaps.getValue());
}
break;
case 5:
default:System.out.println("please enter the right key");
break;
}
}


}
}