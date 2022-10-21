package entities;

/**
 *
 * @author Felipe Pereira
 */
public class OutsourcedEmployee extends Employee {
    
    private Double additionalCharge;
    
    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(Double additionalCharge, String name, Integer hours, double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(">>> OUTSOURCED EMPLOYEE PAYMENT <<<\n");
        sb.append("Name: ").append(super.getName() + "\n");
        sb.append("Salary: R$").append(payment() + "\n");
        return sb.toString();
    }
    
    @Override
    public double payment(){
        
        return super.payment() + additionalCharge * 1.1;
        
        /* EU FIZ ESSE ESSE CÁLCULO GIGANTESCO ABAIXO 
        
        double salary = getHours() * getValuePerHour();
        double totalAdditionalCharge = additionalCharge + (additionalCharge * 0.10);
        return salary += totalAdditionalCharge;
        
        */
    }
    
}
