
import java.util.*;
	
public class Person implements Comparable<Person>
{
	private long id;
	private String name, address;
	
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
	
	public String toString()
	{
		return "(" + this.name + ", " + this.id + ", " + this.address + ")";
	}
			
}
