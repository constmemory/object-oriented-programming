/*
Create a base class named Employee that contains a method displayDetails() which prints
general employee details such as name and department. Now create a subclass Manager that
inherits from Employee and overrides the displayDetails() method to include additional
information such as the manager's team size or project name. In the main method, create
objects of both Employee and Manager classes and call the displayDetails() method using
each object to show how Java determines which version of the method to execute at runtime.
*/

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
        System.out.println("Project Name : " + projectName);
    }
}

public class p15 {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", "IT");

        Manager m = new Manager("Priya", "HR", 10, "Project Alpha");

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();
    }
}
