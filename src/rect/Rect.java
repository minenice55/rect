/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rect;

import java.util.Random;

/**
 *
 * @author Devrin Aiden Tiongson
 */
public class Rect {
    private int width;
    private int height;
    private int area;
    private int perimeter;
    
    /**
     * default constructor, gens random dimensions between 1 to 10
     */
    public Rect() {
        int min = 1;
        int max = 10;
        Random prng = new Random();
        this.width = prng.nextInt(max - min + 1) + min;
        this.height = prng.nextInt(max - min + 1) + min;
        //this.calcArea();
    }
    
    /**
     * constructor, provides width and height
     * @param width new rect's width
     * @param height new rect's height
     */
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
        //this.calcArea();
    }
    
    /**
     * clones a rect's data
     * @param rect rect to clone from
     */
    public Rect(Rect rect) {
        this.width = rect.width;
        this.height = rect.height;
        //this.calcArea();
    }
    
    /**
     * gets the area of a rect
     */
    public int calcArea() {
        return width * height;
    }
    
    public int calcPerimeter() {
        return (width + height) * 2;
    }
    
    /**
     * compares two rects
     * @param other rect to compare with
     * @return true if rect data is equal, false if not
     */
    public boolean equals(Rect other) {
        return this.width == other.width && this.height == other.height;
    }
    
    /**
     * formats rect data to a string
     * @return formatted string containing rect data
     */
    @Override
    public String toString() {
        return String.format("Rect width: %d, height: %d, "
                + "area: &d, perimeter: %d", 
                width, height, getWidth(), getHeight());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //public int getArea() {
    //    return area;
    //}
}
