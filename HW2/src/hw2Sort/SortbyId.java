package hw2Sort;

import hw2.Person;
import java.util.*;

// implement Comparator to compare more than one field/element
public class SortbyId implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		long id1 = p1.getId();
		long id2 = p2.getId();
		
		// if two ids are same, further sort based on their name
		if (id1 == id2)
		{
			return (p1.getName().compareTo(p2.getName()));	
		}
		else 
		{
			return (int)(id1-id2);
		}
	}
}

