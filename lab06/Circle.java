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
public class Circle extends Shape {

    private int Radius;
    
    public Circle(int x, int y, int r) {
        super(x, y);
        Radius = r;
    }
    
    @Override
    public void draw() {
        System.out.println("Draw circle at (" + x + ", " + y +")");
    }
    
    @Override
    public void erase() {
        System.out.println("Erase circle at (" + x + ", " + y +")");
    }
    
}
