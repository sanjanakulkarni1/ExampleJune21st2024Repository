package Polymorphism;
abstract class Deliveryboy1
{
    abstract void refers();
}
class swiggy extends Deliveryboy1 {
    void refers() {
        String s1 = "delivers food";
        System.out.println("swiggy delivery boy:" + s1);
    }
}
class amazon extends Deliveryboy1 {
    void refers() {
        String s2 = "delivers amazon products";
        System.out.println(" amazon delivery boy:" + s2);
    }
}


public class Deliveryboy {
    public static void main(String[] args) {
        Deliveryboy1 uses = null;

        swiggy p1 = new swiggy();
        amazon p2 = new amazon();


        uses = p1;
        uses.refers();

        uses = p2;
        uses.refers();
    }
}








