package practise;

public class Person {
	
	private String name;
	private int age;
	public Person() {
		super();
		System.out.println("Person constructor called");
		this.age = 5;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Person displayed");
	}

}
