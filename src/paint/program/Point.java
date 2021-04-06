
package paint.program;

/**
 * Point class, holds all the properties that is required for a point*
 * @author Jacky
 */
public class Point implements Shape {

    /**
     * instance variables
     */
    private double x, y;

    /**
     * Default Constructor Sets to origin (0,0)
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * coordinate  constructor, sets up the instance variables
     *
     * @param x the horizontal value
     * @param y the vertical value
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * point consturctor, sets a point to another point
     * @param a takes in a point
     */
    public Point(Point a) {
        this.x = a.getX();
        this.y = a.getY();
    }

    /**
     * adds a point to the current point
     *
     * @param a Takes in another point
     */
    public void add(Point a) {
        this.x += a.getX();
        this.y += a.getY();
    }

    /**
     * calculates the distance from the point to another
     *
     * @param a takes in another point
     * @return the distance/hypotenuse of point a to the instance's point
     */
    public double distance(Point a) {
        //Uses trig and hypotneuse to find the distance
        double adj = a.getX() - this.getX();
        double opp = a.getY() - this.getY();
        return Math.hypot(adj, opp);
    }

    /**
     * calculates the length from the origin to the point
     *
     * @return the hypotenuse of the x and y value
     */
    public double length() {
        return Math.hypot(getX(), getY());
    }

    /**
     * finds the "area" of a point
     *
     * @return 0 | points don't have area so its 0
     */
    @Override
    public double area() {
        return 0;
    }

    /**
     * Checks if an object is equal to the current point
     *
     * @param o takes in any object in
     * @return true if the point matches with the object, or false if it doesn't
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Point)) {
            return false; //this will ensure we only ever compare Points
        } else {
            Point otherPoint = (Point) o; //sets the object type to point for comparison

            //check if the two point's coordinates are the same
            //note  use == because comparison of primative data types
            return this.x == otherPoint.getX() && this.y == otherPoint.getY();
        }
    }

    /**
     * Expands/decompresses the point from the origin,
     *
     * @param multiplier The value that will expand/decompress the x and y val
     */
    @Override
    public void scale(double multiplier) {
        //if multiplier > 1 will expand, will decompress if 0 < multiplier < 1
        //if neg will reflect
        this.x *= multiplier;
        this.y *= multiplier;
    }

    /**
     * Moves/translates the point on horizontal and vertical axis
     *
     * @param dx translates the horizontal left (-) or right (+)
     * @param dy translates the vertical down (-) or up (+)
     */
    @Override
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /**
     * Rotates the point from the origin
     *
     * @param degrees Takes in a angle with degrees units
     */
    @Override
    public void rotate(double degrees) {
        //convert the degrees to radians so java can use it
        double rad = Math.toRadians(degrees);

        //Calculates using cos and sin using given formula,  
        double rX = (x * Math.cos(rad)) - (y * Math.sin(rad));
        double rY = (x * Math.sin(rad)) + (y * Math.cos(rad));
        //sets the new rotated value to x and y
        x = rX;
        y = rY;

        //Extra: rounds 0s to 0 to make easier to read and no funky values with E
        if (Math.abs(x) < 0.000001) {
            x = 0;
        }
        if (Math.abs(y) < 0.000001) {
            y = 0;
        }

    }

    /**
     * Follows Java's Pattern to convert the points to a string
     *
     * @return the coordinates(integers) of a point
     */
    @Override
    public String toString() {
        return ("(" + x + "," + y + ")");

    }

    /**
     * Encapsulate Getter for private x
     *
     * @return the x value of the point
     */
    public double getX() {
        return x;
    }

    /**
     * Encapsulate Getter for private y
     *
     * @return the y value of the point
     */
    public double getY() {
        return y;
    }

}
