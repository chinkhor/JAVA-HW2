package hw2Sort;
import hw2.Person;
import java.util.*;

// implement Comparator to compare more than one field/element
public class SortbyName implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		String name1 = p1.getName();
		String name2 = p2.getName();
		
		// if two names are same, sort based on their id
		if (name1.equals(name2))
		{
			return (int)(p1.getId()-p2.getId());
		}
		else 
		{
			return (name1.compareTo(name2));
		}
	}
}

