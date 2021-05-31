import java.util.Scanner;
class Divide{
int i,i1,j,j1;

int b[]=new int[100];
int c[]=new int[100];
int d[]=new int[100];
void divide(int l,int r,int d[])
{
int m;
m=(l+r)/2;
int i=l;
int j=m;
int i1=m+1;
int j1=r;
for( int k=0;k<m;k++)
{
b[k]=d[i];
c[k]=d[i1];
i++;
i1++;
}
System.out.println("this is the first array:");
for( int k=0;k<m;k++)
{
System.out.println(b[k]);

}
System.out.println("this is the second array:");
for( int k=0;k<m;k++)
{

System.out.println(c[k]);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Divide obj=new Divide();
System.out.println("Enter the number of array=");
int n=sc.nextInt();
int y=n-1;
int x=0;
int a[]=new int[100];

for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
obj.divide(x,y,a[n]);
}
}
