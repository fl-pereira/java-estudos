package entities;

/**
 *
 * @author Felipe Pereira
 * 
 */
public class ImportedProduct extends Product {
    
    private Double customsFee;
    
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag(){
        String priceTag = super.getName() 
                + "$ " 
                + String.format("%.2f", totalPrice()) 
                + " (Customs fee: $ " 
                + String.format("%.2f", customsFee)
                + ")";
        return priceTag;
    }
    
    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
}
