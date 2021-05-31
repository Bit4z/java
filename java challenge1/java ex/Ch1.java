import java.util.Scanner;
class Ch1{
public static void main(String args[])
{
int sum=0,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number=");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

System.out.println("The Result is=");
for(int i=0;i<n;i++)
{
while(a[i]>0)
{
k=a[i]%10;
sum=(sum*10)+k;
a[i]=a[i]/10;
}
}
if(sum%3==0)
{
System.out.println("true");
}
else{
System.out.println("false");
}
}
}


