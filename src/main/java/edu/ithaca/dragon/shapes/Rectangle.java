package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        // throw new RuntimeException("Not implemented yet");
       return length*width;
    }

    public void doubleSize(){
        // throw new RuntimeException("Not implemented yet");
        double rectangle_size = length*width*2;
        this.length = Math.sqrt(rectangle_size);
        this.width = Math.sqrt(rectangle_size);
    }

    public double longestLineWithin(){
        // throw new RuntimeException("Not implemented yet");
        if (this.length > this.width)
    }
    
}
