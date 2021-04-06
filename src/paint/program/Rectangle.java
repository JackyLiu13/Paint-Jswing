
package paint.program;

/**
 *Rectangle Class   
 * manipulating the rectangle and setting it up
 * @author Jacky
 */
public class Rectangle implements Shape {

    /**instance variable, protected so that square class can use*/
    protected Point q,w,e,r;
    /**default constructor and sets all points to origin*/
    public Rectangle() {
        q = new Point();
        w = new Point();
        e = new Point();
        r = new Point();
    }
    /**
     * Constructor using points
     * @param a first corner
     * @param b second corner
     * @param c third corner
     * @param d fourth corner
     */
    public Rectangle(Point a, Point b, Point c, Point d) {
        //sets up the corner points using point class
        q = new Point(a);
        w = new Point (b);
        e = new Point (c);
        r = new Point (d);
    }
    /**
     * Constructor using lines
     * @param a first length
     * @param b first width
     * @param c second length
     * @param d second width
     */
    public Rectangle(Line a, Line b, Line c, Line d) {
        //sets first and second corner to the end points of the first length
        q = a.getA();
        w = a.getB();
        //Finds the opposite line that doesnt contain the first and second corner points and collects the end points of that line to be the other 2 corner points
//        if (!((b.toString().contains(q.toString())) || (b.toString().contains(w.toString())))){
//            e = b.getA();
//            r = b.getB();
//            
//        }else if (!((c.toString().contains(q.toString())) || (c.toString().contains(w.toString())))){
//            e = c.getA();
//            r = c.getB();            
//        }else if (!((d.toString().contains(q.toString())) || (d.toString().contains(w.toString())))){
//            e = d.getA();
//            r = d.getB();            
//        }
        if (((b.getA().equals(q) == false && (b.getB().equals(q))) == false && ((b.getA().equals(w) == false && (b.getB().equals(w) == false))))){
            e = b.getA();
            r = b.getB();            
        }else if (((c.getA().equals(q)  == false&& (c.getB().equals(q))) == false && ((c.getA().equals(w) == false && (c.getB().equals(w)) == false)))){
            e = c.getA();
            r = c.getB();            
        }else if (((d.getA().equals(q) == false && (d.getB().equals(q))) == false && ((d.getA().equals(w) == false && (d.getB().equals(w)) == false)))){
            e = d.getA();
            r = d.getB();            
        }
    }
    
    /**
     * Stretch/decompress or reflect the rectangle
     * @param multiplier will stretch/decompress or reflect the rectangle
     */
    @Override
    public void scale(double multiplier) {
        q.scale(multiplier);
        w.scale(multiplier);
        e.scale(multiplier);
        r.scale(multiplier);

    }
    /**
     * Moves/translates the rectangle on horizontal and vertical axis
     *
     * @param dx translates the horizontal left (-) or right (+)
     * @param dy translates the vertical down (-) or up (+)
     */
    @Override
    public void translate(double dx, double dy) {
        //each point will call method from point to translate with same parameters
        q.translate(dx, dy);
        w.translate(dx, dy);
        e.translate(dx, dy);
        r.translate(dx, dy);
        
    }
    /**
     * Rotates the rectangle from the origin
     *
     * @param degrees Takes in a angle with degrees units
     */
    @Override
    public void rotate(double degrees) {
        //each point will call method from point to rotate with same parameters
        q.rotate(degrees);
        w.rotate(degrees);
        e.rotate(degrees);
        r.rotate(degrees);
    }
    
     /**
     * finds area of the rectangle     
     * @return the distance of one side times the other side's distance
     */
    @Override
    public double area() {     
        //checks if side qw is not the diangle if inputed incorrectly
        if (q.distance(w) != Math.hypot(q.distance(e), e.distance(w)))
        {
            //multiplies qw and the side that meets the w corner
            return (q.distance(w) * e.distance(w));
        }
        else
        {
            //multiplies qw's adjecent and opposite
            return (e.distance(w) * e.distance(q));            
        }
        
    }

     /**
     * Checks if an object is equal to the current rectangles
     *
     * @param o takes in any object in
     * @return true if the line matches with the object, or false if it doesn't
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Rectangle)) {
            return false; //this will ensure we only ever compare rectangles
        }
        else{
        //converts the object to a rectangle object
        Rectangle otherRect = (Rectangle) o;

        //check if the rectangle's four corner point's coordinates are equal to the object
        return this.q.equals(otherRect.q) && this.w.equals(otherRect.w) && this.e.equals(otherRect.e) && this.r.equals(otherRect.r);
        }
    }
    
 /**
     * Follows Java's Pattern to convert the corner points of a rectangle to a string
     *
     * @return the Rectangles's corner point's coordinates
     */
    @Override
    public String toString() {
        
        return (q.toString() + w.toString() + e.toString() + r.toString() );
    }

}
