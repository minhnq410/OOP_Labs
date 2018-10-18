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
public class Triangle extends Shape {
    private int side_1;
    private int side_2;
    private int side_3;

    public Triangle(int x, int y, int s1, int s2, int s3) {
        super(x, y);
        //if ( (s1 + s2) > s3 && (s2 + s3) > s1 && (s3 + s1) > s2)
        //{
            this.side_1 = s1;
            this.side_2 = s2;
            this.side_3 = s3;
        //}
    }

    @Override
    public void draw() {
        System.out.println("Draw triangle at (" + x + ", " + y +")");
    }

    @Override
    public void erase() {
        System.out.println("Erase triangle at (" + x + ", " + y +")");
    }
    
    
}
