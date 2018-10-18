/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Minh
 */
public class Rectangle extends Shape {

    private double Width;
    private double Length;
    
    public Rectangle(int x, int y, double w, double l) {
        super(x, y);
        Width = w;
        Length = l;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }
    
    @Override
    public void draw() {
        System.out.println("Draw rectangle at (" + x + ", " + y +")");
    }

    @Override
    public void erase() {
        System.out.println("Erase rectangle at (" + x + ", " + y +")");
    }
    
}
