package thiskeyword;

public class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("My name is " + this.name);
	}
	
	
	public static void main(String[] args) {
		Person p = new Person("Kalyan");
		
		p.displayName();
		
	}
}
