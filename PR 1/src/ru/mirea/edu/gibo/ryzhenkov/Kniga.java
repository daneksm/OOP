package ru.mirea.edu.gibo.ryzhenkov;
import java.lang.*;
public class Kniga {
    private String janr;
    private int kolvo;
    private int strany;

    public String getJanr (){
        return janr;
    }
    public Kniga (String z, int v,int s){
        janr=z;
        kolvo=v;
        strany=s;
    }
public void setJanr(String janr){
        this.janr=janr;
}
    @Override
    public String toString(){
        return "Книга жанра " + janr + "продалась в " + kolvo + " копий в "
                + strany + " странах.";
    }

}
