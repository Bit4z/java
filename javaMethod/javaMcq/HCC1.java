import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;


class HCC1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String p=sc.nextLine();

ArrayList<Integer> ar=new ArrayList<Integer>();
//System.out.print("s="+s+"p="+p);
int l=s.length();
StringBuffer str1=new StringBuffer(p);
int k=0;
int g=p.length();
l=l-g;
int j=g;
for(int i=0;i<=l;i++)
{
String str3="";
String str=s.substring(i,j);
j=j+1;
for(int x=0;x<p.length();x++)
{
String str2=p.substring(x);
if(str.contains(str2))
{
str3=str3+str2;
System.out.println(str2);
}
}
if(str.contains(str3))
{
ar.add(k);
k++;
}
}
System.out.println(ar);
}
}