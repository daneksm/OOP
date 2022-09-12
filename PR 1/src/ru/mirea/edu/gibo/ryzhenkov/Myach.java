package ru.mirea.edu.gibo.ryzhenkov;
import java.lang.*;
public class Myach {
    private String nazvanie;
    private int razmer;

    public String getNazvanie() {
        return nazvanie;
    }
public Myach(String z, int v){
        nazvanie=z;
        razmer=v;
}

public void setNazvanie(String nazvanie){
        this.nazvanie = nazvanie;
}
    @Override
    public String toString(){
        return "Нужно купить мяч фирмы, " + nazvanie + "необходим "
                + razmer + " размер";
    }
}
