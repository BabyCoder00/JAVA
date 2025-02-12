// Class 1: Main Class
public class MultiClassExample {
    public static void main(String[] args) {
        Person person = new Person("Abhishek", 40);
        person.displayInfo();

        Employee employee = new Employee("E123", "Software Engineer");
        employee.displayEmployeeDetails();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee {
    String empId;
    String jobTitle;

    Employee(String empId, String jobTitle) {
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Job Title: " + jobTitle);
    }
}
