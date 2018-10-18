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
abstract public class Shape {
    protected int x;
    protected int y;
    protected String Color;
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract public void draw();
    abstract public void erase();
    
    public void addTo(Layer layer) {
        layer.add(this);
    }
    
    public void coloredWith(String color) {
        Color = color;
    }
    
    public void moveTo (int x, int y) {
        erase();
        this.x = x;
        this.y = y;
        draw();
    }
}
