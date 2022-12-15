package figures;

public class Circle extends Figures {
    double r;

    public Circle(double r) {
        this.r = r;
    }
    double square2(){
        square=r*r*Math.PI;
        return square;
    }
    double perimeter2(){
        perimeter=2*r*Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
