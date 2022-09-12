package ru.mirea.edu.gibo.ryzhenkov;
import java.lang.*;
public class Sobaka {
    private String poroda;
    private int kolvo;

    public String getName(){
        return poroda;
    }
    public Sobaka(String z, int v) {
        poroda=z;
        kolvo=v;
    }
    public void setPoroda(String poroda){
        this.poroda=poroda;
    }
    @Override
    public String toString(){
        return "Хочу " + kolvo + " собаку/и породы" + poroda;
    }
}
