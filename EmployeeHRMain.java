// 4. Employee and HRManager Override
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working on general tasks.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing HR activities and recruitment.");
    }

    public void addEmployee(String employeeName) {
        System.out.println("HR Manager added new employee: " + employeeName);
    }
}

public class EmployeeHRMain {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        HRManager hr = new HRManager(75000);

        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        System.out.println("-----------------------------------");
        hr.work();
        System.out.println("HR Manager Salary: $" + hr.getSalary());
        hr.addEmployee("David Miller");
    }
}
