import java.util.Scanner;
class BT{
int s,c=0;
void search(int arr[],int low,int high)
{
int mid;
if((low)<=high)
{

mid=(low+high)/2;



this.divide(arr,low,mid,high);
}
else if(low>high)
{
System.out.println("The element does not found");
}


}
void divide(int arr[],int low,int mid,int high)
{
if(arr[mid]==s)
{
System.out.println("This is the searching element\t"+s+"at the"+(mid+1)+"position");
c=1;
}
else if(s>arr[mid]){
int i,j;
i=mid+1;
j=high;
this.search(arr,i,j);

}
else{
int k,l;
k=low;
l=mid-1;
this.search(arr,k,l);
}

}
public static void main(String args[])
{
BT bs=new BT();
Scanner sc=new Scanner(System.in);
int n;
int arr[]=new int[100];
System.out.println("enter the number of array+");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the searching element");
bs.s=sc.nextInt();
int low=0;
int high=n-1;
bs.search(arr,low,high);
}
}