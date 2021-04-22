
package paint.program;

/** Triangle class
 * responsible for manipulating the triangle and setting it up
 * @author Jacky
 */
public class Triangle implements Shape{
    /** instance points     */
    private Point a,b,c;
    /**
     * Default constructor that leaves the triangle to origin
     */
    public Triangle()
    {
        a = new Point();
        b = new Point();
        c = new Point();
    }
    /**
     * Consturctor taking in 3 points which will be the corners of triangle
     * @param a first point
     * @param b second point
     * @param c third point
     */
    public Triangle(Point a, Point b, Point c)
    {
        //sets the instance points so the corners from the line
        this.a = new Point(a);
        this.b = new Point(b);
        this.c= new Point(c);
    }
    /**
     * constructor taking in 3 lines and takes the corner points of the 3 lines
     * @param q first line of triangle
     * @param w second line of triangle
     * @param e third line of triangle
     */
    public Triangle(Line q,Line w,Line e){
        //sets the first two points of line
         a = q.getA();
        b = q.getB();
        //checks if line w shares any points as a and b, if not will set the non commmon point as the last corner point
        if ((w.getA().equals(a) == false) && (w.getA().equals(b)==false)){
            c = w.getA();     
        }
        else if ((w.getB().equals(a) == false) && (w.getB().equals(b)==false)){
            c = w.getB();     
        }
    }
     /**
     * Stretch/decompress or reflect the triangle
     * @param multiplier will stretch/decompress or reflect the triangle
     */
    @Override
    public void scale(double multiplier) {
        //uses methods from point
        a.scale(multiplier);
        b.scale(multiplier);
        c.scale(multiplier);
    }
/**
     * Moves/translates the triangle on horizontal and vertical axis
     *
     * @param dx translates the horizontal left (-) or right (+)
     * @param dy translates the vertical down (-) or up (+)
     */
    @Override
    public void translate(double dx, double dy) {
        //uses method from point to translate
        a.translate(dx,dy);
        b.translate(dx,dy);
        c.translate(dx,dy);
        
    }
    /**
     * Rotates the triangle from the origin
     *
     * @param degrees Takes in a angle with degrees units
     */
    @Override
    public void rotate(double degrees) {
        //uses the methods from point to rotate
        a.rotate(degrees);
        b.rotate(degrees);
        c.rotate(degrees);
    }
    
    /**
     * finds area of the triangle using Heron's Formula so that can calculate any area
     * s = (a+b+c)/2 = 6 | Area = √( s(s - a)(s - b)(s - c) ) | https://www.mathsisfun.com/geometry/herons-formula.html
         
     * @return area of a triangle
     */
    @Override
    public double area() { 
        double s = (a.distance(b)+b.distance(c) +c.distance(a))/2;
        double area = Math.sqrt(s*(s-a.distance(b))*(s-b.distance(c))*(s-c.distance(a)));
        return area;    
        
    }
    
   /**
     * Checks if an object is equal to triangle
     *
     * @param o takes in any object in
     * @return true if the triangle matches with the object, or false if it doesn't
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Triangle)) {
            return false; //this will ensure we only ever compare Triangle
        }
        else{
            //sets the object to triangle so it can be compared
        Triangle otherTri = (Triangle) o;

        //check if the coordinates of the corner ponts of the triangles are the same
        return this.a.equals(otherTri.a) && this.b.equals(otherTri.b) && this.c.equals(otherTri.c);
        }
    }
    
    
    /**
     * Follows Java's Pattern to convert the corner points of a triangle to a string
     *
     * @return the coordinates of the triangle's corner point
     */
    @Override
    public String toString()
    {
        return (a.toString() + b.toString() + c.toString());
    }
    
    
    //NEW EDIT FOR PAINT GUI
    //Encapsulate the points
    public Point getA()
    {
        return a;
    }
     public Point getB()
    {
        return b;
    }
      public Point getC()
    {
        return c;
    }
    
}
