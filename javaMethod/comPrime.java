import java.util.*;
class comPrime{
public int isPrime(int n)
{
int count=0;
int c=0;
while(c!=1)
{
n++;
for(int i=2;i<=9;i++)
{
count=0;
if(n%i==0)
{
count=1;
break;
}
}
if(count==0)
{
c=1;
}

}

return n;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
comPrime obj=new comPrime();
System.out.println("Enter the first number=");
int n1;
n1=sc.nextInt();
System.out.println("Enter the second number=");
int n2;
n2=sc.nextInt();
if(obj.isPrime(n1)==n2)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}