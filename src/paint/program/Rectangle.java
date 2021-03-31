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
public class Rectangle implements Shape {

    //private Line q, w, e, r, width, length;
    private Point q,w,e,r;
    public Rectangle() {
        q = new Point();
        w = new Point();
        e = new Point();
        r = new Point();
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        q = a;
        w = b;
        e = c;
        r = d;
    }
    public Rectangle(Line a, Line b, Line c, Line d) {
        q = a.getA();
        w = a.getB();
        if (!((b.toString().contains(q.toString())) && (b.toString().contains(w.toString())))){
            e = b.getA();
            r = b.getB();
        }else if (!((c.toString().contains(q.toString())) && (c.toString().contains(w.toString())))){
            e = c.getA();
            r = c.getB();
        }else if (!((d.toString().contains(q.toString())) && (d.toString().contains(w.toString())))){
            e = d.getA();
            r = d.getB();
        }
    }
    private void reorder()
    {
        
    }
    
    @Override
    public void scale(double multiplier) {
        q.scale(multiplier);
        w.scale(multiplier);
        e.scale(multiplier);
        r.scale(multiplier);

    }

    @Override
    public void translate(double dx, double dy) {
        q.translate(dx, dy);
        w.translate(dx, dy);
        e.translate(dx, dy);
        r.translate(dx, dy);
//        setDimensions();
    }

    @Override
    public void rotate(double degrees) {
        q.rotate(degrees);
        w.rotate(degrees);
        e.rotate(degrees);
        r.rotate(degrees);
    }

    @Override
    public double area() {     
        
        if (q.distance(w) != Math.hypot(q.distance(e), e.distance(w)))
        {
            return (q.distance(w) * e.distance(w));
        }
        else
        {
            return (e.distance(w) * e.distance(q));            
        }
        
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Rectangle)) {
            return false; //this will ensure we only ever compare Points
        }
        Rectangle otherRect = (Rectangle) o;

        //check if the two point's coordinates are equal
        return this.q == otherRect.q && this.w == otherRect.w && this.e == otherRect.e && this.r == otherRect.r;
    }

    @Override
    public String toString() {
        //setDimensions();
        return (q.toString() + e.toString());
    }

}
