/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aparsons
 */
public class FileReadingWriting {
    
    public static void main(String[] args) {
        
    ArrayList<String> names = new ArrayList<>();
    
          try(BufferedReader BR = new BufferedReader(new FileReader("BoyNames.txt")))
        {
            for(int i = 0; i < 200;i++)
            {
                names.add(BR.readLine());
            }
            Collections.sort(names);
        }
        catch(Exception ex)
        {
             System.out.println("Could not find file");       
        }
          
          
          try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("sort_BoyNames.txt", true))))
        {
            for(String namea : names)
            {
                writer.println(namea);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Could not write to file");
        }
    }
   
}
