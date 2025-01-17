package Array1;

class Student{
    int sid;
    String name;
    int age;
    String std;

    public void display(){
        System.out.println("Student ID: " + sid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Standard: " + std);
    }
}

public class ObjectsOfArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].sid = 1;
        students[0].name = "CSR";
        students[0].age = 15;
        students[0].std = "10th";

        students[1] = new Student();
        students[1].sid = 2;
        students[1].name = "ADD";
        students[1].age = 16;
        students[1].std = "11th";

        students[2] = new Student();
        students[2].sid = 3;
        students[2].name = "YUIS";
        students[2].age = 17;
        students[2].std = "12th";

        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}
