package vn.edu.likelion.Employee;

/**
 * Employee -
 *
 * @param
 * @return
 * @throws
 */
public abstract class  Employee {
    private String name;
    private double salary;
    private double bonus;


    public Employee() {}
    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    abstract double calculateSalary();
    abstract void displayInfor();

}
