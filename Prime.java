
public class Prime 
{
	public static void main(String[] args) 
	{
		int n=31, flag=0;
		for (int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not Prime");
				flag=1;
				break;
			}
		}
			if(flag==0)
			System.out.println("Number is Prime");
		}
}
