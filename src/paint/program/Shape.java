/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.program;

/**
 *
 * @author Jacky
 */
public interface Shape {
    
    public void scale(double multiplier);
    
    public void translate(double dx,double dy );
    
    public void rotate(double degrees);
        
    public double area();
        
    public boolean equals(Object a);  
    
    public String toString();
    
    
   
}
