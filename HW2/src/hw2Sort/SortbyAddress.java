package hw2Sort;

import java.util.Comparator;
import hw2.Person;

public class SortbyAddress implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		String addr1 = p1.getAddress();
		String addr2 = p2.getAddress();
		
		// if addresses are same, sort based on Person's names of two same addresses
		if (addr1.equals(addr2))
		{
			return (p1.getName().compareTo(p2.getName()));
		}
		else 
			return (addr1.compareTo(addr2));
	}
}
