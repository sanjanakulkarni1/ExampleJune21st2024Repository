package Polymorphism;
abstract class Vehiclewheels
{
    abstract void refers();
}
class bus extends Vehiclewheels {
    void refers() {
        int s1 = 6;
        System.out.println("bus refers to:" + s1);
    }
}
class bike extends Vehiclewheels {
    void refers() {
        int s2 = 2;
        System.out.println(" bike refers to:" + s2);
    }
}


public class Vehicle1 {
    public static void main(String[] args) {
        Vehiclewheels uses = null;

        bus p1 = new bus();
        bike p2 = new bike();


        uses = p1;
        uses.refers();

        uses = p2;
        uses.refers();
    }
}





