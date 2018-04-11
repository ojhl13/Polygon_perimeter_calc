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
    private int index=0;
    public Polygon ()
    {
        arrayV = new Vertex[100];
       

        
        
    }
    
    boolean setNewVertex(float x, float y)
    {
        boolean result =false;
        int temp=0;
        
        if( 100 > index)
        {
            if(0 != index){
                temp=index-1;
                
                if((x != arrayV[temp].x) || (y != arrayV[temp].y)) {
                        arrayV[index].UpdateVertex(x, y);
                        index ++;
                        result = true;
                    }
                else
                {
                    System.err.println("Dato Repetido");
                }
            
                
                
            }
            else
            {
                arrayV[index].UpdateVertex(x, y);
                System.out.println();
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
    void printLastVertex()
    {
        String str;
        str = "X: " + String.valueOf(arrayV[index].x) + " Y:" + (String.valueOf(arrayV[index].y)) ;
        System.out.println(str);
    }

    float calcPerimeter() 
    {
        float result=0;
        int i2=0;
        for (int i = 0; i < index-1; i++) 
        {
            i2=i+1;
            System.out.println(String.valueOf(arrayV[i].x));
            System.out.println(String.valueOf(arrayV[i].y));
            float a  = arrayV[i2].x ;
                  a -= arrayV[i].x;
            float b  = arrayV[i2].y ;
                  b -= arrayV[i].y;
                
        
            result += ((float) Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2)))));
         
            
            
        }
        
        return result;
        
    }

  
}
