
public class PrimeUsingMethod 
{
	static void prime(int n)
	{	int flag=0;
		for(int j=2; j<n;j++)
		{
			if(n%j==0)
			{
				System.out.println(n+" - is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(n+" - is prime");
	}
	
	public static void main(String[] args) 
	{
		prime(11);
		prime(13);
		prime(51);
		prime(17);
	}
}
