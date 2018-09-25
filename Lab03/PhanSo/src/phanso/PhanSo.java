/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author Minh
 */
public class PhanSo {

    private int TuSo;
    private int MauSo;

    public void setTuSo(int TuSo) {
        this.TuSo = TuSo;
    }

    public void setMauSo(int MauSo) {
        this.MauSo = MauSo;
    }

    public int getTuSo() {
        return TuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public PhanSo(int TuSo, int MauSo) {
        int gcd = Gcd(TuSo, MauSo);
        this.TuSo = TuSo / gcd;
        this.MauSo = MauSo / gcd;        
    }
    
    public PhanSo(PhanSo ps) {
        this.TuSo = ps.getTuSo();
        this.MauSo = ps.getMauSo();
    }
    
    //Phuong thuc toi gian phan so
    public int Gcd (int a, int b){
        if (a == 0){
            if (b > 0){
                return b;
            } else return -b;
        }
        
        return Gcd(b % a, a);
    }
    
    public PhanSo ToiGian (){
        int gcd = Gcd(TuSo, MauSo);
        this.setTuSo(TuSo / gcd);
        this.setMauSo(MauSo / gcd);
        return this;
    }
    
    //Cac phuong thuc tinh toan
    public PhanSo CongPs (PhanSo ps){
        PhanSo Tong;
        Tong = new PhanSo(this);
        if (this.MauSo == ps.MauSo){
            Tong.TuSo = this.TuSo + ps.TuSo;
        } else{
            Tong.TuSo = this.TuSo * ps.MauSo + ps.TuSo * this.MauSo;
            Tong.MauSo = this.MauSo * ps.MauSo;            
        }
        Tong.ToiGian();
        return Tong;
    }
    
    
    public PhanSo TruPs (PhanSo ps){
        PhanSo temp;
        temp = new PhanSo(ps);
        //temp.setTuSo(-ps.getTuSo());
        temp.TuSo = -temp.TuSo;
        return this.CongPs(temp);
    }
    
    public PhanSo NhanPs (PhanSo ps){
        PhanSo Tich;
        Tich = new PhanSo(this);
        Tich.TuSo = this.TuSo * ps.TuSo;
        Tich.MauSo = this.MauSo * ps.MauSo;
        Tich.ToiGian();
        return Tich;
    }    
    
    public PhanSo ChiaPs (PhanSo ps){
        PhanSo Thuong;
        Thuong = new PhanSo(this);
        Thuong.TuSo = this.TuSo * ps.MauSo;
        Thuong.MauSo = this.MauSo * ps.TuSo;
        Thuong.ToiGian();
        return Thuong;
    }
    
    // So sanh bang nhau
    public boolean equals (PhanSo ps){
        return this.TuSo == ps.TuSo && this.MauSo == ps.MauSo;        
    }
    
    // In phan so
    public void PrintPs (PhanSo ps){
        System.out.println(ps.TuSo + "/" + ps.MauSo);
    }
    
    public void PrintPs (){
        System.out.println(this.TuSo + "/" + this.MauSo);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo ps1 = new PhanSo(1,5);        
        PhanSo ps2 = new PhanSo(2,5);
        PhanSo ps3 = new PhanSo(2,3);
        ps2.PrintPs(ps1.TruPs(ps2));
        ps3.PrintPs(ps3.ChiaPs(ps2));
        PhanSo ps4 = new PhanSo(5,10);
        ps4.PrintPs();
        System.out.println(ps4.equals(ps1.ChiaPs(ps2)));
    }
    
}
