/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd_fib;

/**
 *
 * @author Minh
 */
public class Gcd_Fib {
    
    //Dung thuat toan Euclid va de quy
    static int Gcd (int a, int b){
        if (a == 0){
            if (b > 0){
                return b;
            } else return -b;
        }
        
        return Gcd(b % a, a);
    }
    // Dung de quy
    static int Fib (int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fib (n - 1) + Fib (n - 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Gcd (-45,15));
        System.out.println(Fib(6));
    }
    
}
