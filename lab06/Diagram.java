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
public class Diagram {
    private ArrayList<Layer> Diagram;

    public Diagram(ArrayList<Layer> Diagram) {
        this.Diagram = new ArrayList();
        this.Diagram = Diagram;
    }

    public Diagram() {
        this.Diagram = new ArrayList();
    }
    
    public void add(Layer layer) {
        Diagram.add(layer);
    }

    public ArrayList<Layer> getDiagram() {
        return Diagram;
    }
    
    public void removeCircles() {
        for (int i = 0; i < Diagram.size(); i++)
        {
            Diagram.get(i).removeCircles();
            if (Diagram.get(i).isEmpty())
            {
                Diagram.remove(i);
                i--;
            }
        }
    }
    
    public void drawDiagram() {
        if (Diagram.isEmpty())
        {
            System.out.println("This diagram is empty.");
        }
        else
        {
            for (int i = 0; i < Diagram.size(); i++)
            {
                System.out.println("Draw layer: " + (i+1));
                Diagram.get(i).drawLayer();
            }
        }        
    }
    
}
