package ru.mirea.gibo2.ryzhenkov;
import java.lang.*;
public class Second {
    public static void main(String[] args) {
        System.out.println("Hello \n world!");
   /* int a, b, c;
    a=6;
    b=7;
    c=a+b;
        System.out.println("c=" + c + " zv");
    */
        Pryamougolnik p1 = new Pryamougolnik(10, 5);
        System.out.println(p1);

        p1.setV(6);
        p1.setZ(8);
        System.out.println(p1);

        int g=p1.getV()*p1.getZ();
        System.out.println("ploshad = " + g);
p1.getArea();
        System.out.println("ploshad = " + p1.getArea());

        Circle p2 = new Circle(4);
        System.out.println(p2);

        p2.setR(7);
        System.out.println(p2);

        double h=2*3.14*p2.getR()*p2.getR();
        System.out.println("plosh = " + h);
        System.out.println("plosh = " + p2.k3());
    }
}
