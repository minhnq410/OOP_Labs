/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author Minh
 */
public class Layer {
    private ArrayList<Shape> Layer;
    
    public Layer(ArrayList<Shape> Layer) {
        this.Layer = new ArrayList();
        this.Layer = Layer;
    }
    
    public Layer() {
        this.Layer = new ArrayList();
    }
    
    public void add(Shape shape) {
        Layer.add(shape);
    }
    
    public void addTo(Diagram diagram) {
        diagram.add(this);
    }

    public ArrayList<Shape> getLayer() {
        return Layer;
    }
    
    public void removeCircles() {
        for (int i = 0; i < Layer.size(); i++)
        {
            if(Layer.get(i) instanceof Circle )
            {
                //Layer.get(i).erase();
                Layer.remove(i);
                i--;
            }
        }
    }
    
    public void removeTriangles() {
        for (int i = 0; i < Layer.size(); i++)
        {
            if(Layer.get(i) instanceof Triangle )
            {
                //Layer.get(i).erase();
                Layer.remove(i);
                i--;
            }
        }
    }
    
    public void drawLayer() {
        if (Layer.isEmpty())
        {
            System.out.println("This layer is empty.");
        }
        else
        {
            for (int i = 0; i < Layer.size(); i++)
            {
                Layer.get(i).draw();
            }
        }
    }

    boolean isEmpty() {
        return Layer.isEmpty();
    }
}
