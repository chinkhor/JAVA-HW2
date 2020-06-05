
public class Main {

	public static void main(String[] args) {
		Person p = new Person ("Jasper");
		p.setAddress("Setia V Residence");
		p.setId(816);
        System.out.println(p.getName() +"'s Id is " + p.getId() + " and address is " + p.getAddress());
	}

}
