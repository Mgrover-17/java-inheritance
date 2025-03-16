class Employee{
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("name: "+name+"  id: "+id+"  salary: "+salary);
    }
}
class Manager extends Employee{

    private int teamSize;
    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        System.out.println("calling manager constructor");
        this.teamSize=teamSize;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("team size: "+teamSize);
    }
}
class Developer extends Employee{

    private String programmingLanguage;
    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        System.out.println("calling developer constructor");
        this.programmingLanguage=programmingLanguage;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("programming language: "+programmingLanguage);
    }
}
class Intern extends Employee{

    private int duration;

    Intern(String name, int id, int salary, int duration) {
        super(name, id, salary);
        System.out.println("calling intern constructor");
        this.duration=duration;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("duration: "+duration+" months");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Naman", 101, 80000, 5);

        manager.displayDetails();
        System.out.println();

        Employee developer = new Developer("NMG", 102, 60000, "Java");

        developer.displayDetails();
        System.out.println();

        Employee employee=new Intern("riya",103,30000,6);
        employee.displayDetails();


    }
}
