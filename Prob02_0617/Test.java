package Prob02_0617;

public class Test {
    public static void main(String[] args) {

        Person p = new Person("Edward", 20000);
        Taxi t = new Taxi("잘 간다");

        p.takeTaxi(t);

        p.showInfo();
        t.showInfo();
    }
}
