/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.ArrayList;
import static java.util.Arrays.sort;

/**
 *
 * @author Minh
 */
public class Lab11 {

    static <T extends Comparable> void BubbleSort( ArrayList<T> a )
    {
        for (int i = 0; i < a.size(); i++)
        {
            for (int j = 0; j < a.size() - i - 1; j++)
            {
                if (a.get(j).compareTo(a.get(j+1)) < 0)
                {
                    a.add(j + 2, a.get(j));
                    a.remove(j);
                }
            }
        }
    }
    
    static <T extends Comparable> T findMax(ArrayList<T> a)
    {
        return null;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> ALS = new ArrayList<>();
        ALS.add("This");
        ALS.add("is");
        ALS.add("Sparta!!");
        for (int i = 0; i < ALS.size(); i++)
        {
            System.out.print(ALS.get(i) + " ");
        }
        System.out.println();
        BubbleSort(ALS);
        for (int i = 0; i < ALS.size(); i++)
        {
            System.out.print(ALS.get(i) + " ");
        }
        System.out.println();
        
        ArrayList<Integer> ALI = new ArrayList<>();
        ALI.add(4);
        ALI.add(9);
        ALI.add(6);
        for (int i = 0; i < ALI.size(); i++)
        {
            System.out.print(ALI.get(i) + " ");
        }
        System.out.println();
        BubbleSort(ALI);
        for (int i = 0; i < ALI.size(); i++)
        {
            System.out.print(ALI.get(i) + " ");
        }
        
        ArrayList<? extends Comparable> EX2;
        EX2 = new ArrayList<>();
        Integer a1 = 1;
        Double a2 = 5.5;
        String a3 = "3";
        
        
        String[] a = {"This", "is", "Sparta!!"};
        sort(a);
        for (int i = 0; i < 3; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
}
