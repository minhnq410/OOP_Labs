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
public class QuaCam extends HoaQua {

    public QuaCam(String taste) {
        super("cam", taste);
    }

    @Override
    public String getTaste() {
        return super.getTaste();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return ("Mau: " + getColor() + "; Vi: " + getTaste());
    }
    
    
    
}
