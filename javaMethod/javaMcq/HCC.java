import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;


class HCC
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
//str1=p;
int k=0;
str1.reverse();
String m;
int g=p.length();
l=l-g;
int j=g;
for(int i=0;i<=l;i++)
{
//m=s.charAt(i);
String str=s.substring(i,j);
j=j+1;
if(str.contains(p)||str.contains(str1) )
{
//System.out.println(str);
ar.add(k);
k++;
}
}
System.out.println(ar);
}
}