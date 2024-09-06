package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private double size;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.size = this.calcArea();
    }

    public double calcArea(){
        // throw new RuntimeException("Not implemented yet");
       return length*width;
    }

    public void doubleSize(){
        // throw new RuntimeException("Not implemented yet");
        double size = this.calcArea() * 2;
        this.length = Math.sqrt(size);
        this.width = Math.sqrt(size);
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
