/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon_perimeter_calc;

/**
 *
 * @author oscar
 */

public class Vertex {
     static float x;
     static float y;

    Vertex ()
    {
        x = 0;
        y = 0;
    }
    Vertex(float x1, float y1)
    {
        x = x1;
        y = y1;
    }
     float GetX()
    {
        return x;
    }
    float GetY()
    {
        return y;
    }
    
    static void UpdateVertex(float x2, float y2)
    {
         System.out.println("entre");
        x = x2;
        y = y2;
    }
    
}
