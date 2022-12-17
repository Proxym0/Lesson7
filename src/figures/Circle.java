package figures;

public class Circle extends Figures {
    double r;

    public Circle(double r) {
        this.r = r;
    }
    double square2(){
        double square=r*r*Math.PI;
        setSquare(square);
        return square;
    }
    double perimeter2(){
       double perimeter=2*r*Math.PI;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                "} " + super.toString();
    }
}
