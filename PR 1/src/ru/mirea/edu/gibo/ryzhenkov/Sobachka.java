package ru.mirea.edu.gibo.ryzhenkov;
import java.lang.*;
public class Sobachka {
    public static void main (String[ ] args){
        Sobaka k1 = new Sobaka(" овчарка.", 1);
        Sobaka k2 = new Sobaka(" бигль.", 4);
        k1.setPoroda(" корги.");
        System.out.println(k1);
        System.out.println(k2);
    }
}
