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
public class Point implements Shape{
    private double x,y;
    
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point (int x, int y){
        this.x = x;
        this.y = y;
                
    }
    public void add (Point a) //adds a point to this point
    {        
        this.x += a.getX();
        this.y += a.getY();
    }
    
    public double distance(Point a)//calculates the distance from the point to another
    {
        double adj = a.getX() - this.getX();
        double opp = a.getY() - this.getY();
        return Math.hypot(adj, opp);
    }
    public double length() //calculates the length from the origin to the point
    {        
        return Math.hypot(getX(), getY());
    }
   
    @Override
    public double area()  
    //points don't have area
    {
       return 0;
    }

    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
       
        if (!(o instanceof Point)) return false; //this will ensure we only ever compare Points

        Point otherPoint = (Point) o;
        
        //check if the two point's coordinates are equal
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    @Override
    public void scale(double multiplier) {
        x *= multiplier;
        y *= multiplier; 
    }

    @Override
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void rotate(double degrees) {
        double rad = Math.toRadians(degrees);
        x = getX() * Math.cos(rad ) - getY() * Math.sin(rad);
        y = getX() * Math.sin(rad ) + getY() * Math.cos(rad);

    }
    
    @Override
    public String toString(){
        return ("("+getX() + "," + getY()+")");
        
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
    
}
