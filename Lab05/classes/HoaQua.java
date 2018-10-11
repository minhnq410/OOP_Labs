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
public class HoaQua {
    private String Color;
    private String Taste;

    public HoaQua(String Color, String Taste) {
        this.Color = Color;
        this.Taste = Taste;
    }    

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTaste() {
        return Taste;
    }

    public void setTaste(String Taste) {
        this.Taste = Taste;
    }

    @Override
    public String toString() {
        return Color + ", " + Taste;
    }    
}
