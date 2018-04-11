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
    private float x;
    private float y;

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
    float GetX()
    {
        return this.x;
    }
    float GetY()
    {
        return this.y;
    }
    
}
