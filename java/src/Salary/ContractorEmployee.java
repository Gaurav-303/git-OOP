package Salary;
class ContractorEmployee extends Employee {
    double contractAmount;

    ContractorEmployee(String name, int id, double contractAmount) {
        super(name, id);
        this.contractAmount = contractAmount;
    }

    double calculateSalary() {
        return contractAmount;
    }
}