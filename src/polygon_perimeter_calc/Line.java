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
public class Line {
    private Vertex V1;
    private Vertex V2;
    
    public Line()
    {
        
        this.V1 = new Vertex(0f , 0f);
        this.V2 = new Vertex(1f , 0f); 
        
    }
    public Line( float x1 , float y1, float x2 , float y2)
    {
        this.V1 = new Vertex ( x1 , y1 );
        this.V2 = new Vertex ( x2 , y2 ); 
    }
    
    float Length(Line L)
    {
        float result = 0;
        float a = this.V1.GetX() + this.V2.GetX();
        float b = this.V1.GetY() + this.V2.GetY();
                
        
        result = (float) Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2))));
        
        return result;
    }
    
    
}
