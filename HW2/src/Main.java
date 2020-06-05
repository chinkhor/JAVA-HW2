import hw2.Person;
import hw2Sort.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Jasper", 816, "Setia V Residence"));
		people.add(new Person("Dylan", 704, "92 Changkat Sg Ara 1A"));
		people.add(new Person("Jason", 116, "92 Changkat Sg Ara 1A"));
		people.add(new Person("Evon", 705, "Setia V Residneces"));
		people.add(new Person("Aaron", 116, "USA"));
		people.add(new Person("Jason", 100, "USA"));
		
		// override toString to display all elements of Person ArrayList
		System.out.println(people.toString());
		
		// use Comparable interface to sort
		Collections.sort(people);
		System.out.println("After sorting based on id:");
		Person.showArrayList(people);
		
		// use Comparator interface to sort
		System.out.println("After sorting based on address:");
		Collections.sort(people, new Person());
		Person.showArrayList(people);
		
		// use Comparator interface to sort based on given field
		System.out.println("After sorting based on name:");
		Collections.sort(people, new SortbyName());
		Person.showArrayList(people);
		
		System.out.println("After sorting based on id:");
		Collections.sort(people, new SortbyId());
		Person.showArrayList(people);
		
		System.out.println("After sorting based on address:");
		Collections.sort(people, new SortbyAddress());
		Person.showArrayList(people);
	}

}
