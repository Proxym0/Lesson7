package figures;

public class Triangle extends Figures {
    double i;
    double j;
    double z;
    double h;

    public Triangle(double i, double j, double z, double h) {
        this.i = i;
        this.j = j;
        this.z = z;
        this.h = h;
    }

    double square3(){
       double square=(i*h)/2;
        setSquare(square);
        return square;
    }
    double perimeter3(){
       double perimeter=i+j+z;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "i=" + i +
                ", j=" + j +
                ", z=" + z +
                ", h=" + h +
                "} " + super.toString();
    }
}
