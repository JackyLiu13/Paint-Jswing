
package paint.program;

/**Square Class
 * Methods to maniuplate square object mainly inheriting all of rectangle's mehods
 * @author Jacky
 */
public class Square extends Rectangle{
    /** default constructor, inherits from rectangle*/
    public Square()
    {
        super();
    }
    /**Point Constructor 
     * Takes in a point which will the be the corner points of each square
     * @param a the first corner point
     * @param b the second corner point
     * @param c the third corner point
     * @param d the fourth corner point
     */
    public Square(Point a, Point b, Point c, Point d)
    {
        super(a,b,c,d);
    }
    /** Line constructor
     * Takes in lines and finds the corner points of the lines to form square
     * @param a first line (width/length)
     * @param b second line (width/length)
     * @param c third line (width/length)
     * @param d fourth line (width/length)
     */
    public Square(Line a, Line b, Line c, Line d) {
        super(a,b,c,d);
    }
     /**
     * Checks if an object is equal to square
     *
     * @param o takes in any object in
     * @return true if the square matches with the object, or false if it doesn't
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Square)) {
            return false; //this will ensure we only ever compare Square
        }
        else{
            //sets to square object for comparison
        Square otherSqu = (Square) o;

        //check if the coordinates of the square's corner point are equalto object
        return this.q.equals(otherSqu.q) && this.w.equals(otherSqu.w) && this.e.equals(otherSqu.e) && this.r.equals(otherSqu.r);
        }
    }
    /**
     * Calculates the area of a square by squaring one side length
     * @return squared sidelength of q to w
     */
    @Override
    public double area()
    {        
        return Math.pow(q.distance(w),2);
    }
    
}
