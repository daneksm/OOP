package ru.mirea.edu.gibo.ryzhenkov;
import java.lang.*;
public class Knizhechka {
    public static void main (String[] args){
        Kniga k1=new Kniga("комедия ", 50540, 4);
        Kniga k2=new Kniga("трагедия ", 18987,10);
        Kniga k3=new Kniga("драма ", 40958,5);
        k1.setJanr("детектив ");

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}
