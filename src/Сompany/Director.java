package Сompany;

public class Director extends Accountant {
    public Director(String name) {
        super(name);
    }
    public void takeName() {
        System.out.println("Director - " + name);
    }
}
