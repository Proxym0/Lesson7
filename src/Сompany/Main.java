package Сompany;

public class Main implements Company {
    public static void main(String[] args) {
        Accountant accountant=new Accountant("Бухгалтер");
        accountant.takeName();
        System.out.println(accountant);
        Worker worker=new Worker("рабочий");
        worker.takeName();
        System.out.println(worker);
        Director director=new Director("Директор");
        director.takeName();
        System.out.println(director);
    }
    @Override
    public void takeName() {
    }
}
