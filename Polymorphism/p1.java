package Polymorphism;

abstract class Geometricfigure
{
    abstract void area();
}
class Square extends Geometricfigure{
    void area()
    {
        int side=4;
        System.out.println("Area of the Square:"+(side*side));
    }
}
class Rectangle extends Geometricfigure{
    void area()
    {
        int length=3,breadth=6;
        System.out.println("Area of the Rectangle:"+(length*breadth));
    }
}
class Circle extends Geometricfigure{
    void area()
    {
        double pi=3.16;
        double r =2.5;
        System.out.println("Area of the Circle:"+(pi* r* r));
    }
}
public class p1 {
    public static void main(String[] args) {

        Geometricfigure figure=null;
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();

        figure=square;
        figure.area();

        figure=rectangle;
        figure.area();

        figure=circle;
        figure.area();
    }
}

