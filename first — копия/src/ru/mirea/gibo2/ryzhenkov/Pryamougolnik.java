package ru.mirea.gibo2.ryzhenkov;

public class Pryamougolnik {
    private int z;
    private int v;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public Pryamougolnik(int z, int v) {
        this.z = z;
        this.v = v;
    }

    @Override
    public String toString() {
        return "Pryamougolnik{" +
                "z=" + z +
                ", v=" + v +
                '}';
    }
    public int getArea() {
        return z*v;
    }
}
