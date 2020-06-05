import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Jasper", 816, "Setia V Residence"));
		people.add(new Person("Dylan", 704, "92 Changkat Sg Ara 1A"));
		people.add(new Person("Jason", 116, "92 Changkat Sg Ara 1A"));
		people.add(new Person("Evon", 705, "Setia V Residneces"));
		people.add(new Person("Aaron", 116, "USA"));
		
		System.out.println(people.toString());
		Collections.sort(people);
		
		System.out.println("After sorting based on id:");
		
		for(Person p:people)
		{
			System.out.println(p.getName() +"'s Id is " + p.getId() + " and address is " + p.getAddress());
		}
		
		System.out.println("After sorting based on name:");
		
		Collections.sort(people, new SortbyName());
		for(Person p:people)
		{
			System.out.println(p.getName() +"'s Id is " + p.getId() + " and address is " + p.getAddress());
		}
	}

}
