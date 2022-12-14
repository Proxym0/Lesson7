package figures;

public class Circle extends figures{
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

}
