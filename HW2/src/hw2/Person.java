package hw2;
import java.util.*;
	
public class Person implements Comparable<Person>, Comparator<Person>
{
	private long id;
	private String name, address;
	
	// dummy constructor for Comparator use
	public Person ()
	{
		
	}
	
	public Person (String name)
	{
		this.name = name;
	}
	
	public Person (String name, long id, String address)
	{
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public void setId (long id)
	{
		this.id = id;
	}
	
	public void setAddress (String address)
	{
		this.address = address;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public long getId ()
	{
		return this.id;
	}
	
	public String getAddress()
	{
		return this.address;
	}

	public String getName()
	{
		return this.name;
	}
	
	// override for displaying Person's elements: name, id and address
	public String toString()
	{
		return "(" + this.name + ", " + this.id + ", " + this.address + ")";
	}
	
	public static void showArrayList (ArrayList<Person> people)
	{
	    for(Person p:people)
	    {
		     System.out.println(p.getName() +"'s Id is " + p.getId() + " and address is " + p.getAddress());
	    }
	}
	
	// override for Comparable interface
	public int compareTo (Person otherPerson)
	{
		if (this.equals(otherPerson))
		{
			return 0;
		}
		else if (this.id < otherPerson.id)
		{
			return -1;
		}
		else if (this.id > otherPerson.id)
		{
			return 1;
		}
		else 
		{
			return (this.name.compareTo(otherPerson.name));
		}
	}
	
	
	// override for Comparator interface
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
