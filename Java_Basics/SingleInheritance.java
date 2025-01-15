//package Inheritance;
class Employee{
    int basesalary =40000;

    public void EmpSalary(){
        System.out.println("Base's Salary: " + basesalary);
    }
}
class Programmer extends Employee{
    int ins=15000;
    int rent = 20000;
    int food =10000;

    public void calculateSalary(){
        int proctc = basesalary +ins+rent+food;
        System.out.println("Programmer's Salary: " + proctc);

    }
}
class Manage extends Employee{
    int ins=5000;
    int rent = 10000;
    int food =8000;
    public void calculateSalary(){
        int manctc = basesalary +ins+rent+food;
        System.out.println("Manager's Salary: " + manctc);

    }

}

public class SingleInheritance{

    public static void main(String[] args){
        Programmer p = new Programmer();
        Manage m = new Manage();
        Employee e= new Employee();
        e.EmpSalary();
        p.calculateSalary();
        m.calculateSalary();
    }

}