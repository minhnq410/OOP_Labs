/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Minh
 */
public class Lab09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "C:\\Users\\Minh\\Documents\\NetBeansProjects\\Lab09\\Text.txt";
        try {
            System.out.println(readContentFromFile(path));
            writeContentToFile(path);
            System.out.println(readContentFromFile(path));
            appendContentToFile(path);
            System.out.println(readContentFromFile(path));
        } catch (IOException ex) {
        }
        
        String folderPath = "C:\\Users\\Minh\\Documents\\NetBeansProjects\\Lab09\\";
        String fileName = "Text.txt";
        findFileByName(folderPath, fileName);
    }
    
    public static String readContentFromFile (String path) throws IOException
    {
        String s;
        BufferedReader br = new BufferedReader(new FileReader (new File(path)));
        s = br.readLine();
        br.close();
        return s;
    }
    
    public static void writeContentToFile (String path) throws IOException
    {
        String s = "Hello, World!";
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
        bw.write(s);
        bw.flush();
        bw.close();
    }
    
    public static void appendContentToFile (String path) throws IOException
    {
        String s = " Lab 09";
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path), true));
        bw.write(s);
        bw.flush();
        bw.close();
    }
    
    public static File findFileByName (String folderPath, String fileName)
    {
        File f = new File(folderPath + fileName);
        if (f.exists())
        {
            System.out.println("File has found! File stream is returned.");
            return f;
        }
        else {
            System.out.println("File hasn't found!");
            return null;
        }
    }
}
