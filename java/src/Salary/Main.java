package Salary;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Amit", 201, 60000);
        Employee emp2 = new PartTimeEmployee("Riya", 202, 250, 60);
        Employee emp3 = new ContractorEmployee("John", 203, 40000);

        System.out.println(emp1.name + " earns: ₹" + emp1.calculateSalary());
        System.out.println(emp2.name + " earns: ₹" + emp2.calculateSalary());
        System.out.println(emp3.name + " earns: ₹" + emp3.calculateSalary());
    }
}

