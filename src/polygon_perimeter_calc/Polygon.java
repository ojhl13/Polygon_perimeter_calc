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
public class Polygon {
    private Vertex []  arrayV ;
    private int index;
    public Polygon ()
    {
        arrayV = new Vertex[100];
        index=0;

        
        
    }
    
    boolean setNewVertex(float x, float y)
    {
        boolean result =false;
        if( 100 > index)
        {
            if(0 != index){
                if((x != arrayV[index--].GetX()) && (y != arrayV[index--].GetY()))
                {
                    arrayV[index].UpdateVertex(x, y);
                    index ++;
                    result = true;
            
                }
                
            }
            else
            {
                arrayV[index].UpdateVertex(x, y);
                    index ++;
                    result = true;
            }
        }
        else 
        {
            
            System.err.println("Array FULL");
        }
        return result;
        
    }
    void eeraseLastVertex()
    {
        arrayV[index] = new Vertex();
        index --;
        
        
    }

    float calcPerimeter() 
    {
        float result=0;
        
        for (int i = 0; i < index-1; i++) {
            
            
            float a = arrayV[i].GetX() + arrayV[i++].GetX();
            float b = arrayV[i].GetY() + arrayV[i++].GetY();
                
        
            result += ((float) Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2)))));
        
            
            
        }
        
        return result;
        
    }

  
}
