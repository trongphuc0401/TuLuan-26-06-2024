package vn.edu.likelion.Employee;

/**
 * Programmer -
 *
 * @param
 * @return
 * @throws
 */
public class Programmer extends Employee{
    public Programmer() {
        super();
    }

    @Override
    void displayInfor() {
        System.out.println("Programmer Name: "+getName());
        System.out.println("Base Salary: $"+getSalary());
        System.out.println("Bonus: $"+getBonus());
        System.out.println("Total Salary: $"+calculateSalary());

    }

    @Override
    double calculateSalary() {
        return getBonus()+getSalary();
    }

    public Programmer(String name, double salary, double bonus) {
        super(name, salary, bonus);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public double getBonus() {
        return super.getBonus();
    }

    @Override
    public void setBonus(double bonus) {
        super.setBonus(bonus);
    }
}
