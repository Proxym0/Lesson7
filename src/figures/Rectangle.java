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
       double square=a*b;
        setSquare(square);
        return square;
    }
    public double perimeter1() {
       double perimeter=2 * (a + b);
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                "} " + super.toString();

    }
}
