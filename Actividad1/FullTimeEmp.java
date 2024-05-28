public class FullTimeEmp extends Employee {
    private int salary;

    public FullTimeEmp(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public FullTimeEmp(FullTimeEmp f) {
        super(f.getName(), f.getId());
        this.salary = f.salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    public int getSalary() {
        return salary;
    }
}