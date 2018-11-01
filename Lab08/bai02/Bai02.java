
package bai02;

import java.io.*;

import java.io.FileNotFoundException;


public class Bai02 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            nullPointer();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try {
            arrayIndex();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try {
            divideZero();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try {
            classCast();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try {
            fileNotFound();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void nullPointer () throws NullPointerException
    {
        Integer a = null;
        a++;        
    }
    
    public static void arrayIndex () throws ArrayIndexOutOfBoundsException
    {
        int[] b = new int[5];
        b[5] = 10;
    }
    
    public static void divideZero() throws ArithmeticException
    {
        int a = 10 / 0;
    }
    
    public static void classCast() throws ClassCastException
    {
        Object a = 5;
        String s = (String) a;
    }
    
    public static void fileNotFound() throws FileNotFoundException, IOException
    {
        FileReader fr = new  FileReader("abc.txt");
        int a = fr.read();
    }
}
