package Polymorphism;

abstract class Birds
{
    abstract void refers();
}
class peacock extends Birds {
    void refers() {
        String s = "National bird";
        System.out.println("peacock refers to:" + s);
    }
}
class pigeon extends Birds {
    void refers() {
        String s = "messenger";
        System.out.println(" pigeon refers to:" + s);
    }
}
class Hen extends Birds {
    void refers() {
        String s = "dairy prod";
        System.out.println(" hen refers to:" + s);
    }
}

public class p2 {
    public static void main(String[] args) {
        Birds uses = null;

        peacock p1 = new peacock();
        pigeon p2 = new pigeon();
        Hen p3 = new Hen();

        uses = p1;
        uses.refers();

        uses = p2;
        uses.refers();

        uses = p3;
        uses.refers();

    }
}


