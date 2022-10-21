package entitites;

public class Retang {

    public double w;
    public double h;

    public double area() {
        return w * h;
    }

    public double perimeter() {
        return w + w + h + h;
    }

    public double diagonal() {
        return Math.sqrt((w * w) + (h * h));
    }

}
