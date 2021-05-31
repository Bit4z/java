import java.util.Map;
import java.util.HashMap;
class HashMap1{
public static void main(String args[])
{
HashMap<Integer,String> hmap=new HashMap();
hmap.put(1,"ziya");
hmap.put(2,"aman");
hmap.put(3,"chaman");
hmap.put(4,"junaid");
hmap.put(5,"aneesh");
System.out.println(hmap);
	String k="junaid";
for(Map.Entry<Integer, String>hmaps: hmap.entrySet())
{
if(k==hmaps.getValue())
{
System.out.println(true);
}
}
}
}