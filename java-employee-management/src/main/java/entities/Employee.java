package entities;

/**
 *
 * @author Felipe Pereira
 */
public class Employee {
    
    private String name;
    private Integer hours;
    private double valuePerHour;
    
    public Employee(){}

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }
 
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(">>> EMPLOYEE PAYMENT <<< \n");
        sb.append("Name: ").append(getName() + "\n");
        sb.append("Salary: ").append(payment() + "\n");
        return sb.toString();
    }
    
    public double payment(){
        return hours * valuePerHour;
    }
}
