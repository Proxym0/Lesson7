package Сompany;

public class Worker extends Accountant{
    public Worker(String name) {
        super(name);
    }
    public void takeName() {
        System.out.println("Worker - " + name);
    }
}
