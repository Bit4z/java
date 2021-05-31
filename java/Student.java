
import java.util.Scanner;
public class Student {
	
	 int Uid;
	 String name;
	long marks;
	public void setInfo(int Uid,String name,long marks){
		this.Uid=Uid;
		this.name=name;
		this.marks = marks;
	}
	public String getinfo(){
		
		return Uid+"\t\t"+name+"\t\t"+marks;
	}

}
class test{
	public static void main(String arg[]){
		
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter Number of student --- ");
		int s = ob.nextInt();
Student g=new Student();
		Student arr[] = new Student[s];
		Student st =null;
		for(int i=0;i<s;i++){
			System.out.print("Enter Student  ID - ");
			int u= ob.nextInt();
			System.out.print("Enter Student Name - ");
			String un = ob.next();
			System.out.print("Enter Student Marks - ");
			long ma = ob.nextLong();
			st=new Student();
		   st.setInfo(u, un, ma);
		   arr[i] = st;
		}
	
	while(true){
		System.out.println("Enter 1 for add new student  ");  
		System.out.println("Enter 2  for search  student  "); 
		System.out.println("Enter 3 to view all student data  ");
		System.out.println("Enter 4 for change student name by uid  ");
		System.out.println("Enter 5 for exit application  ");  
		int en = ob.nextInt();
		switch(en){
		
		case 1:			System.out.print("Enter Student  ID - ");
		int uid = ob.nextInt();
		System.out.print("Enter Student Name - ");
		String uname = ob.next();
		System.out.print("Enter Student Marks - ");
		long marks = ob.nextLong();
		st=new Student();
		   st.setInfo(uid, uname, marks);break;
		   
		case 2: System.out.print("Enter Student  ID - ");
		int stu =ob.nextInt();
		int f=0,p=0;
		for(int i=0;i<arr.length;i++){

			if(stu==arr[i].Uid) 
{
System.out.println(arr[i].getinfo());
break;
}
		}
		
		
		
		case 3:
			System.out.println("Uid\t\tName\t\tMarks");
			for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].getinfo());
			}
			break;
		case 4: System.out.print("Enter Student  ID - ");
		int stI =ob.nextInt();
		
		
		break;
		
		case 5:System.exit(0);break;
			
		}
}
		
	}
	}
