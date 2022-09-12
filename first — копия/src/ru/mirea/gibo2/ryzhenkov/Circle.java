package ru.mirea.gibo2.ryzhenkov;

public class Circle {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
    public double k3(){
        return 2*3.14*r*r;
    }
}
