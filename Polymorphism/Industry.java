package Polymorphism;
abstract class Industryproduct
{
    abstract void refers();
}
class textile extends Industryproduct {
    void refers() {
        String s1 = "garment production";
        System.out.println("textile industry refers to:" + s1);
    }
}
class chemical extends Industryproduct {
    void refers() {
        String s2 = "drugs ,tablets";
        System.out.println(" chemical industry refers to:" + s2);
    }
}

public class Industry {
    public static void main(String[] args) {
        Industryproduct uses = null;

        textile p1 = new textile();
        chemical p2 = new chemical();


        uses = p1;
        uses.refers();

        uses = p2;
        uses.refers();
    }
}



