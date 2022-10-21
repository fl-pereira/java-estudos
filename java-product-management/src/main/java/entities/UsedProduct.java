package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Felipe Pereira
 * 
 */
public class UsedProduct extends Product {
    
    private Date manufactureDate;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    
    public UsedProduct() {
        super();
    }

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    
    public String priceTag(){
        String priceTag = super.getName() 
                + " (used) $ " 
                + String.format("%.2f", super.getPrice()) 
                + " (Manufacture date: " 
                + sdf.format(manufactureDate)
                + ")";
        return priceTag;
    }
    
}
