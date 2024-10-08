package edu.ithaca.dragon.shapes;

public class Triangle implements Shape {
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
        if (height > base) {
            return height;
        }
        else {
            return base;
        }
    }

    public String toString(){
        String info_string = "Shape: Triangle | Base: " + String.valueOf(base) + "| Height: " + String.valueOf(height);
        return info_string;
    }
}
