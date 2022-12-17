package figures;

public class Figures {
    private double square;
    private double perimeter;

    public Figures() {
    }

    public Figures(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare(double square) {

        return this.square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return this.perimeter;
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

