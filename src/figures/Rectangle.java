package figures;

public class Rectangle extends Figures {
     double a;
     double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Rectangle() {
        this.a = a;
        this.b = b;
    }
    public double square1() {

        square=a*b;
        return square;
    }
    public double perimeter1() {
        perimeter=2 * (a + b);
        return perimeter;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
