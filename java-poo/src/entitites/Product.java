package entitites;

public class Product {

    private String name;
    private double price;
    private int qty;
    private int code;

    public Product() {

    }
    public Product(String name, double price, int code) {
        this.name   = name;
        this.price  = price;
        this.code   = code;
    }
    public Product(String name, double price, int qty, int code) {
        this.name   = name;
        this.price  = price;
        this.qty    = qty;
        this.code   = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double totalValueInStock() {
        return price * qty;
    }

    public void addProducts(int qty) {
        this.qty += qty;
    }

    public void removeProducts(int qty) {
        this.qty -= qty;
    }

    public String toString() {
        return "Código: "
                + code
                + ", "
                +"Produto: "
                + name
                + ", "
                + "Preço: R$ "
                + String.format("%.2f", price)
                + ", "
                + "Estoque: "
                + qty
                + ", "
                + "Total em valor: "
                + String.format("%.2f", totalValueInStock());
    }

}