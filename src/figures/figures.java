package figures;

public class figures {
    protected double square;
    double perimeter;

    public figures() {
    }

    public figures(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {

        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "figures{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}

