package ru.mirea.java.practice3.ex1;

public class Square extends Rectangle{
    private double side; // ???

    public Square() {
    }

    public Square(double side) { this.side = side; }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() { return side; }

    public void setSide(double side) { this.side = side; }

    @Override
    public void setWidth(double side){ width = side; } // ????

    @Override
    public void setLength(double side){ length = side; } // ???

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}
