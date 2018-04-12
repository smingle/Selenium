class area
{
	int i,j;
	void displayArea(int i, int j)
	{
		System.out.println("Area is - "+(i*j));
	}
}
public class CalculateArea
{

	public static void main(String[] args) 
	{
		area a1=new area();
		area a2=new area();
		
		a1.displayArea(4, 5);
		a2.displayArea(7, 8);
				

	}

}
