import java.util.Scanner;
//import java.util.Arrays; 
import java.lang.*;
import java.util.*;  
public class Ch2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an Array=");
int n;
int arr[]={7,8,9,0};
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The array is=");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("The next array is");
System.out.println(arr);
String[] aArray = new String[5];
String[] bArray = {"a","b","c", "d", "e"};
String[] cArray = new String[]{"a","b","c","d","e"};
for(int i=0;i<bArray.length;i++)
{
System.out.println(bArray[i]);
}
int ar[][]=new int[10][10];
int ar1[][]={{1,2,3},{4,3,2},{1}};
System.out.print("Enter raw=");
int x=sc.nextInt();
System.out.print("Enter collunm=");
int y=sc.nextInt();
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
ar[i][j]=sc.nextInt();

}
}
System.out.println("the 2d array is");
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
System.out.println(ar[i][j]);

}
}
System.out.println("2d array length"+ar1.length);
for(int i=0;i<ar1.length;i++)
{
for(int j=0;j<ar1[i].length;j++)
{
System.out.println(ar1[i][j]);
}
}

ArrayList arrayList = new ArrayList(Arrays.asList(bArray));//Create an ArrayList from an array
System.out.println(arrayList);
boolean b = Arrays.asList(bArray).contains("a");//Check if an array contains a certain value
System.out.println(b);
System.out.println(Arrays.asList(arr));
Arrays.sort(arr);//array sorting in built function.
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
int key=9;
System.out.println("index position is="+Arrays.binarySearch(arr,key));

}
}