// 10. Abstract Employee Salary and DisplayInfo
abstract class Employee {
    protected int id;
    protected String name;
    protected double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Role: Manager | ID: " + id + " | Name: " + name + " | Total Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee {
    private double overtimePay;

    public Programmer(int id, String name, double baseSalary, double overtimePay) {
        super(id, name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("Role: Programmer | ID: " + id + " | Name: " + name + " | Total Salary: $" + calculateSalary());
    }
}

public class AbstractEmployeeMain {
    public static void main(String[] args) {
        Employee mgr = new Manager(301, "Alice Johnson", 80000, 15000);
        Employee prog = new Programmer(302, "Bob Smith", 60000, 8000);

        mgr.displayInfo();
        prog.displayInfo();
    }
}
