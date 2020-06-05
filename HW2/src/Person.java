
public class Person {
	private long id;
	private String name, address;
	
	public Person (String name)
	{
		this.name = name;
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
}
