/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05.main;

import lab05.classes.*;

/**
 *
 * @author Minh
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  Question 02:
        /** Code to test Shape
            Shape sh1 = new Shape();
            Shape sh2 = new Shape("blue", false);
            System.out.println(sh1.toString());
            System.out.println(sh2.toString());
        */
        
        /** Code to test Circle
            Circle c1 = new Circle();
            System.out.println(c1.toString());
            System.out.println(c1.getPerimeter());
            System.out.println(c1.getArea());
        */
        
        /** Code to test Rectangle
            Rectangle rec1 = new Rectangle(2.0, 2.5, "green", false);
            System.out.println(rec1.toString());
            System.out.println(rec1.getPerimeter());
            System.out.println(rec1.getArea());
        */
        
        /** Code to test Square
            Square sq = new Square(2.4, "black", true);
            System.out.println(sq.toString());
            sq.setSide(2.1);
            System.out.println(sq.getWidth());
            System.out.println(sq.getLength());
        */
        
        /** Code to test Question 01:
            CamCaoPhong ccp = new CamCaoPhong();
            System.out.println(ccp.toString());
            CamSanh cs = new CamSanh();
            System.out.println(cs.toString());
        */
    }
    
}
