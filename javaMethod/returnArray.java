import java.util.*;
class returnArray{
public static int[] addSum(int a,int b)
{
int ans[]=new int[2];
ans[0]=a+b;
ans[1]=a-b;
return ans;
}
public static void main(String args[])
{
int ans[]=addSum(100,70);
System.out.println("sum="+ans[0]);
System.out.println("sub="+ans[1]);
}
}