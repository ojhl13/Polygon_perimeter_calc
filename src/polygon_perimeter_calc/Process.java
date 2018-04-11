/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon_perimeter_calc;

import javax.swing.JDialog;

/**
 *
 * @author oscar
 */
public class Process 
{
    Polygon P = new Polygon();
    
    public Process()
    {
        
    }
            
    boolean addNewData(String sx, String sy)
    {
        boolean result = false;
        float x = 0;
        float y = 0;
     try {
         
        if (sx.equals("")) {
           // Handle empty string
        } else {
            x = Float.parseFloat(sx);
           // Handle valid value
        }
        if (sx.equals("")) {
           // Handle empty string
        } else {
            y = Float.parseFloat(sy);
           // Handle valid value
        }
        result = P.setNewVertex(x, y);
        
    } catch (Exception e) {
        // Handle invalid value
        result = false;
              System.err.println("Dato erroneo");  
    }
       
     
        return result;
    }
    
    String printResult()
    {
        return String.valueOf(P.calcPerimeter());
    }
    void printlast()
    {
        P.printLastVertex();
    }
    
    
}
