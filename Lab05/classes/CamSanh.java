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
public class CamSanh extends QuaCam {

    private String skin = "day, san sui";
    private double price = 30000;
    
    public CamSanh() {
        super("ngot");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return super.toString() + "; Vo: " + skin + "; Gia thi truong: " + price + " dong/kg";
    }    
}
