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
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram d = new Diagram();

        Layer layer_1 = new Layer();
        Layer layer_2 = new Layer();

        
        Circle c1 = new Circle(1, 2, 5);
        //c1.draw();
        //c1.moveTo(3, 4);
        Circle c2 = new Circle(5, 2, 2);
        
        Rectangle r = new Rectangle(2, 3, 8, 10);
        
        Triangle t1 = new Triangle(-2, 6, 3, 4, 5);
        Triangle t2 = new Triangle(-6, 2, 6, 10, 8);
        
        Square s = new Square (5, 5, 5);
        
        //Add Shapes to layer_1
        layer_1.add(c1);
        layer_1.add(t1);
        
        //Add shapes to layer_2
        s.addTo(layer_2);
        r.addTo(layer_2);
        layer_2.add(c2);
        layer_2.add(t2);
        
        //Add layers to diagram
        layer_1.addTo(d);
        d.add(layer_2);
        
        //Test remove methods
        d.drawDiagram();
        
        layer_1.removeTriangles();
        layer_2.removeTriangles();
        System.out.println('\n'+"Remove Triangles in layers:");
        d.drawDiagram();
        
        d.removeCircles();
        System.out.println('\n'+"Remove Circles in diagram:");
        d.drawDiagram();
    }
    
}
