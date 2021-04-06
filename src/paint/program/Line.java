package paint.program;

/**
 * Line class holds all the properties that is required for a Line
 *
 *
 * @author Jacky
 */
public class Line implements Shape {

    /**
     * Instance Points
     */
    private Point a, b;

    /**
     * Default constructor to origin
     */
    public Line() {
        this.a = new Point();
        this.b = new Point();
    }

    /**
     * Constructor for beginning and end point and sets to instance points
     *
     * @param pA first point
     * @param pB second point
     */
    public Line(Point pA, Point pB) {
        //sets the instance points from parameters
        this.a = new Point(pA);
        this.b = new Point(pB);
    }

    /**
     * constructor for only one point (end point)
     *
     * @param pB this will be the end point from the origin
     */
    public Line(Point pB) {
        //sets the first to origin and paramter is the other end
        this.a = new Point(0, 0);
        this.b = pB;
    }

    /**
     * Stretch/decompress the line
     *
     * @param multiplier will stretch/decompress or reflect the line
     */
    @Override
    public void scale(double multiplier) {
        //each point will call method from point to scale with same multipler
        this.a.scale(multiplier);
        this.b.scale(multiplier);
    }

    /**
     * Moves/translates the line on horizontal and vertical axis
     *
     * @param dx translates the horizontal left (-) or right (+)
     * @param dy translates the vertical down (-) or up (+)
     */
    @Override
    public void translate(double dx, double dy) {
        //each point will call method from point to translate with same parameters
        a.translate(dx, dy);
        b.translate(dx, dy);
    }

    /**
     * Rotates the line from the origin
     *
     * @param degrees Takes in a angle with degrees units
     */
    @Override
    public void rotate(double degrees) {
        //each point will call method from point to rotate with same parameters
        a.rotate(degrees);
        b.rotate(degrees);
    }

    /**
     * finds "area" of a line
     *
     * @return 0 since lines can't have area
     */
    @Override
    public double area() {
        return 0;
    }

    /**
     * Checks if an object is equal to line
     *
     * @param o takes in any object in
     * @return true if the line matches with the object, or false if it doesn't
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Line)) {
            return false; //this will ensure we only ever compare Points
        } else {
            //converts the object to a line object
            Line otherLine = (Line) o;

            //check if the two point's coordinates are equal using equals method from point
            return (this.a.equals(otherLine.a) && this.b.equals(otherLine.b)) || (this.a.equals(otherLine.b) && this.b.equals(otherLine.a));
        }
    }

    /**
     * Follows Java's Pattern to convert the points to a string
     *
     * @return the line's point's coordinates
     */
    @Override
    public String toString() {
        return (a.toString() + b.toString());

    }

    /**
     * Encapsulate Getter for private a point
     *
     * @return the a point
     */
    public Point getA() {
        return a;
    }

    /**
     * Encapsulate Getter for private b point
     *
     * @return the b point
     */
    public Point getB() {
        return b;
    }

}
