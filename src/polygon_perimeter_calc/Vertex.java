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
        this.x = 0;
        this.y = 0;
    }
    Vertex(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    static float GetX()
    {
        return Vertex.x;
    }
    static float GetY()
    {
        return Vertex.y;
    }
    
    static void UpdateVertex(float x, float y)
    {
         System.out.println("entre");
        Vertex.x = x;
        Vertex.y = y;
    }
    
}
