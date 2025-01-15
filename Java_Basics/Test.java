//package Inheritance;
class Person{
	int id;
	String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
class Student extends Person {
    int grade;

    public Student(int id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    public void display() {
        System.out.println("id: " + id + " Name: " + name + " Grade: " + grade);
    }
}


public class Test {

	public static void main(String[] args) {
		Student st=new Student(101, "Sachin", 6);
		
		
		st.display();

	}

}