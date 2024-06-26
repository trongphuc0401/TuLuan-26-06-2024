package vn.edu.likelion.Employee;

/**
 * Manager -
 *
 * @param
 * @return
 * @throws
 */
public class Manager extends Employee{
    public Manager() {
        super();
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary, bonus);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
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

    @Override
    double calculateSalary() {
        return getBonus()+getSalary();
    }

    @Override
    void displayInfor() {
        System.out.println("Manager Name: "+getName());
        System.out.println("Base Salary: $"+getSalary());
        System.out.println("Bonus: $"+getBonus());
        System.out.println("Total Salary: $"+calculateSalary());

    }
}
