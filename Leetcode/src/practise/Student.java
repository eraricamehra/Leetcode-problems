package practise;

public class Student extends Person {

	private double gpa;
	private int age;
	public double getGpa() {
		return gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student() {
		super();
		System.out.println("Student constructor called");
		this.age = 10;

	}
	
	@Override
	public void display() {
		System.out.println("Student displayed");
	}
}
