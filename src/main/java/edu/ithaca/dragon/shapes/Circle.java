package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;
    private double size;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
        this.size = this.calcArea();
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        // throw new RuntimeException("Not implemented yet");
        return radius*radius*Math.PI;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double new_size = this.size * 2;
        new_size = (new_size / Math.PI);
        this.radius = Math.sqrt(new_size);
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        // throw new RuntimeException("Not implemented yet");
        return radius*2;
    }

    public String toString(){
        String info_string = "Shape: Circle | Radius:" + String.valueOf(radius);
        return info_string;
    }
}
