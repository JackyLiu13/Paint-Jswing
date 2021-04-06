
package paint.program;

/**Shape interface
 * The base of all the shapes using scale,translate,rotate,area,equals,toString
 * @author Jacky
 */
public interface Shape {
    /**Scale method
     * Will make any shape decompress or stretch, can also reflect
     * @param multiplier the value that will decompress (when multiplier is decimal) or stretch (multiplier greater than 1) or reflect (-)
     */
    public void scale(double multiplier);
    /**
     * Translate the shape horizontally or vertically 
     * @param dx horizontal translate
     * @param dy  vertical translate
     */
    public void translate(double dx,double dy );
    
    /**rotates the shape from the origin
     *
     * @param degrees the amount the shape will be rotated
     */
    public void rotate(double degrees);
       /**finds the area within the shape using its properties (side length, radius, etc...) unless point or line that does not have area
        * 
        * @return area value within the shape
        */
    public double area();
    /** follows javas format
     * first checks if they are the same shape
     * then checks if a shape's value is equal to another (that is the same shape)
     * @param o takes in an object to be compared
     * @return true if they are same shape and have same corner points false if doesnt follow both the conditions
     */
    @Override
    public boolean equals(Object o);  
    /**follows java format
     * gets the corner coordinates of a shape and outputs to a string
     * @return the corner points of a shape
     */
    @Override
    public String toString();
       
   
}
