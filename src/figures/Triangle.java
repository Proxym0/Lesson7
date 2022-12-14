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
        square=(i*h)/2;
        return square;
    }
    double perimeter3(){
        perimeter=i+j+z;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "i=" + i +
                ", j=" + j +
                ", z=" + z +
                ", h=" + h +
                '}';
    }
}
