
public class Palindrome
{
	public static void main(String[] args) 
	{
	int r, temp, sum=0;
	int n=656;
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("Palindrom Number");
	else
		System.out.println("Not Palindrom Number");
	}
}
	

