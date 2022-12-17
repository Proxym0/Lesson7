package Сompany;

public class Accountant implements Company {
    String name;
    public Accountant(String name) {
        this.name = name;
    }
    public void takeName() {
        System.out.println("Appointed - " + name);
    }
    @Override
    public String toString() {
        return "Accountant{" +
                "name='" + name + '\'' +
                '}';
    }
}
