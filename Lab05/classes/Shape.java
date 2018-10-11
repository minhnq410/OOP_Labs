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
public class Shape {
    private String Color = "red";
    private boolean Filled = true;

    public Shape(String color, boolean filled) {
        this.Color = color;
        this.Filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setFilled(boolean Filled) {
        this.Filled = Filled;
    }
    
    public boolean isFilled ()
    {
        return Filled;
    }

    @Override
    public String toString(){
        return Color + ", " + Filled;
    }
}
