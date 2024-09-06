package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    private double rectangle_size;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.rectangle_size = this.calcArea();
    }

    public double calcArea(){
        // throw new RuntimeException("Not implemented yet");
       return length*width;
    }

    public void doubleSize(){
        // throw new RuntimeException("Not implemented yet");
        double rectangle_size = this.calcArea() * 2;
        this.length = Math.sqrt(rectangle_size);
        this.width = Math.sqrt(rectangle_size);
    }

    public double longestLineWithin(){
        // throw new RuntimeException("Not implemented yet");
        if (this.length > this.width) {
            return this.length;
        }
        else {
            return this.width;
        }
    }

    public String toString(){
        String info_string = "Shape: Rectangle | Length: " + String.valueOf(length) + "| Width: " + String.valueOf(width);
        return info_string;
    }
    
}
