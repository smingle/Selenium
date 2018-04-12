class student10
{
	int i;
	String name;
public void studentinfo(int n, String nm)
	{
		i=n;
		name=nm;
	}
public void display()
	{
		System.out.println(i+"----"+name);
	}
	
}

public class Student1 
{

	public static void main(String[] args) 
	{
		student10 s1 = new student10();
		student10 s2 = new student10();
		s1.studentinfo(1, "Ram");
		s2.studentinfo(2, "Shyam");
		s1.display();
		s2.display();
	}

}
