/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weka.weka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author visat
 */
public class DataReader {
    List<List<String>> data;
    
    public void read(String fileName) {
        data.clear();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                       
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) 
                    data.add(Arrays.asList(line.split("[,]")));            
            }
            catch (IOException e) {
                data.clear();
                System.err.println("Error: " + e.getMessage());                
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Error: File not found " + fileName);
        }                
    }
    
    public String getAttribute(int elemIndex, int attrIndex) {
        String attr = null;
        try {
            attr = data.get(elemIndex).get(attrIndex);
        }        
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return attr;
    }
    
    public String getClass(int elemIndex) {
        String theClass = null;
        try {
            List<String> buf = data.get(elemIndex);
            theClass = buf.get(buf.size()-1);
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return theClass;
    }
}
