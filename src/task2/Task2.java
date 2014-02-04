/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import task2.TextPackage.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
/**
 *
 * @author serg
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Comparator c=new SizeComparator();
            Text text1=(new TextBuilder("input.txt")).getText();
            text1.sort(c);
            text1.writeToFile("output.txt");
        
        }catch (FileNotFoundException e){
            System.out.println("No file found to read from");
        }catch (IOException e){
            System.out.println("No file found to write to");
        }
    
    }

}
