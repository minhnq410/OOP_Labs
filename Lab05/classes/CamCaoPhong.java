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
public class CamCaoPhong extends QuaCam {
    private String Origin = "Cao Phong, Hoa Binh";
    private double price = 25000;

    public CamCaoPhong() {
        super("chua, ngot diu");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    

    @Override
    public String toString() {
        return (super.toString() + "; Xuat su: " + Origin + "; Gia thi truong: " + price + " dong/kg");
    }
    
    
}
