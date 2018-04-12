class empData
{
	int id;
	float sal;
	String name;
	public void insert(int i, float j, String nm)
	{
		id=i;
		sal=j;
		name=nm;
	}
	public void display()
	{
		System.out.println(id +"--"+sal+"--"+name);
	}

}

public class employee 
{
	public static void main(String[] args) 
	{
	
		empData e1 = new empData();
		empData e2 = new empData();
		empData e3 = new empData();
		e1.insert(1, 1000, "Ram");
		e2.insert(2, 2000, "Shyam");
		e3.insert(3, 3000, "Nam");
		e1.display();
		e2.display();
		e3.display();
		
	}

}
