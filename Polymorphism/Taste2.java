package Polymorphism;

abstract class Taste1
{
    abstract void refers();
}
class lemon extends Taste1 {
    void refers() {
        String s = "sour";
        System.out.println("lemon refers to:" + s);
    }
}
class bitterguard extends Taste1 {
    void refers() {
        String s = "bitter";
        System.out.println(" bitterguard refers to:" + s);
    }
}
class apple extends Taste1 {
    void refers() {
        String s = "sweet";
        System.out.println(" apple refers to:" + s);
    }
}

public class Taste2 {
    public static void main(String[] args) {
        Taste1 uses = null;

        lemon p1 = new lemon();
        bitterguard p2 = new bitterguard();
        apple p3 = new apple();

        uses = p1;
        uses.refers();

        uses = p2;
        uses.refers();

        uses = p3;
        uses.refers();

    }
}


