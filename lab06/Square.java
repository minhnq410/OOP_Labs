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
public class Square extends Rectangle {

    public Square(int x, int y, double side) {
        super(x, y, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Draw square at (" + x + ", " + y +")");
    }

    @Override
    public void erase() {
        System.out.println("Erase square at (" + x + ", " + y +")");
    }
    
    
    
}
