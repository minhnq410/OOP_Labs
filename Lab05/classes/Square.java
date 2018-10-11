/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05.classes;

/**
 *
 * @author Minh
 */
public class Square extends Rectangle {

    //Constructors
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }    
    
    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    
    public double getSide() {
        return this.getWidth();
    }
    
    @Override
    public String toString() {
        return (getSide() + ", " +getColor() + ", " + isFilled());
    }
}
