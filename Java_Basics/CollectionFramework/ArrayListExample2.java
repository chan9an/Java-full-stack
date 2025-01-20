package CollectionFramework;

import java.util.ArrayList;

class Student {
    int id;
    String name;
    int age;
    char gender;

   
    public Student(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

public class ArrayListExample2 {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        
        students.add(new Student(1, "Alice", 20, 'F'));
        students.add(new Student(2, "Bob", 22, 'M'));
        students.add(new Student(3, "Charlie", 21, 'M'));
        students.add(new Student(4, "Diana", 23, 'F'));

        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
