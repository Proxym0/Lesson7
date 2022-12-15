package figures;

import java.util.Arrays;

public class Main extends Figures {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,11);
        double d1=rectangle.square1();
        double d2=rectangle.perimeter1();
        System.out.println(d1);
        System.out.println(d2);
        Circle circle=new Circle(11);
        double c1=circle.square2();
        double c2=circle.perimeter2();
        System.out.println(c1);
        System.out.println(c2);
        Triangle triangle=new Triangle(4,4,5,8);
        double f1=triangle.square3();
        double f2=triangle.perimeter3();
        System.out.println(f1);
        System.out.println(f2);
        Figures[] array={circle,triangle,triangle};
        System.out.println(Arrays.toString(array));
        System.out.println("____________");
        double sum=0;
        for (int g=0;g<array.length;g++){
            sum=sum +array[g].getPerimeter();
        }
        System.out.println(sum);
    }
}
