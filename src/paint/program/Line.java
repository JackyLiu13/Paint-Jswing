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
public class Line implements Shape{
    private Point a,b;
    
    public Line()
    {
        a = new Point();
        b = new Point();
    }
    public Line(Point pA, Point pB)
    {        
        a = pA;
        b = pB;        
    }
    
    public Line(Point pB)
    {
        a= new Point(0,0);
        b = pB;
    }
    
    
    @Override
    public void scale(double multiplier) {
        a.scale(multiplier);
        b.scale(multiplier);
    }

    @Override
    public void translate(double dx, double dy) {
        a.translate(dx, dy);        
        b.translate(dx, dy);
    }

    @Override
    public void rotate(double degrees) {
        a.rotate(degrees);
        b.rotate(degrees);
    }
    
    @Override
    //lines can't have area
    public double area() {
        return 0;
    }
    
    @Override
    public boolean equals(Object o) {
       
        if (!(o instanceof Line)) return false; //this will ensure we only ever compare Points

        Line otherLine = (Line) o;
        
        //check if the two point's coordinates are equal
        return this.a == otherLine.a && this.b == otherLine.b;
    }
    @Override
    public String toString(){
        return ("("+a.getX() + "," + a.getY()+") ("+b.getX() + "," + b.getY()+")");
        
    }
    public Point getA()
    {
        return a;
    }public Point getB()
    {
        return b;
    }
    
   
}
