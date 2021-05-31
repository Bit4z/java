
import java.util.ArrayList;
import java.util.Arrays;

public class DeleteArray {
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40};
		Integer[] array1 = new Integer[array.length];
		for(int i = 0;i< array.length;i++)
		{
			array1[i] = array[i];
		}
		ArrayList<Integer> al  = new ArrayList<Integer>(Arrays.asList(array1));
		System.out.println(al);
		
		for(int i=1;i<array1.length-1;i++)
		{
			System.out.println("t:="+i+":"+al.remove(i));

		}
		
		System.out.println("Traversing List...");  
	    for(Integer i:al){  
	        System.out.println(i);}  
System.out.println(
	}
}