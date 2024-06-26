package vn.edu.likelion.Employee;

/**
 * Main -
 *
 * @param
 * @return
 * @throws
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Corona Cadogan",60000,1000);
        Programmer programmer = new Programmer("Antal Nuka",5000,1000);
        manager.displayInfor();
        System.out.println("----------------------------------");
        programmer.displayInfor();
    }
}
