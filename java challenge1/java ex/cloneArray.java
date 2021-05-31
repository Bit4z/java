import java.util.Scanner;
class cloneArray{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={1,2,3,7,8,9,10};
int cloneArray[]=arr.clone();
System.out.println(arr==cloneArray);
for(int i=0;i<cloneArray.length;i++)
{
System.out.print(cloneArray[i]+"    ");
}
System.out.println(arr);
System.out.print(cloneArray);
int arr1[][]={{11,12,13,14},{17,18,19,20}};
int cloneArray1[][]=arr1.clone();
System.out.println(arr1==cloneArray1);
System.out.println(arr1[0]==cloneArray1[0]);
System.out.println(arr1[1]==cloneArray1[1]);
}
}