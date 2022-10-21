package entitites;

public class Employer {

    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        return salary - tax;
    }

    public void increaseSalaryPercentage(double percentage) {
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return  name
                + ", "
                + "$ "
                + String.format("%.2f", netSalary());
    }
}
