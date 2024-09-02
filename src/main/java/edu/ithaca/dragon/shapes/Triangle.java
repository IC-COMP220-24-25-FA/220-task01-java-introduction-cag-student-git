package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;
    private double triangle_size;

    public Triangle(double triangle_base, double triangle_height){
        base = triangle_base;
        height = triangle_height;
        triangle_size = (triangle_base*triangle_height)/2;
    }

    public double calcArea(){
        return (base*height)/2;
    }

    public void doubleSize(){
        triangle_size = triangle_size*2;
        base = Math.sqrt(triangle_size);
        height = Math.sqrt(triangle_size);
    }

    public double longestLineWithin(){
        // Not implemented yet
    }
}
