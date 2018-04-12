import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Java 
{

	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<String>();
		System.out.println(s.size());
		s.add("India 1");
		s.add("India 2");
		s.add("India 3");
		s.add("India 4");
		s.add("India 5");
		System.out.println(s.size());
		
		Iterator<String> it=s.iterator();
		
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		 */
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
