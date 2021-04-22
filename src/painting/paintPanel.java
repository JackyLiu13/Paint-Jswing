/*
* where the magic
*/
package painting;



import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;
import paint.program.Line;
import paint.program.Rectangle;
import paint.program.Shape;
import paint.program.Triangle;
import paint.program.Point;

/**
 *
 * @author Jacky
 */
public class paintPanel extends javax.swing.JPanel implements MouseListener{
    //max number of shapes
    public Shape[] shapes = new Shape[100];
    
    public boolean drawing = false;    //toggle drawing mode
    public int currentShape  = 0; //what shape is being drawn
       
    protected int numberOfShapes = -1;    //how many shapes there are
    
    protected Point clickPoint1 = null; //sets up the click points
    protected Point clickPoint2 = null;
    
    
    //animation
    private double animateTheta = 0;    //rotation angle
    private boolean animating = false; //check if animating
    private double rotateDirection = 1; //the rotateDirection and angle to rotate
    private int bounceCounter = 0; //bounce shapes
    
    //sets up animation timer 
    Timer animationTimer = new Timer(100, new TimerListener());
    
    
    /**
     * Creates new form paintPanel
     */
    public paintPanel() {
        initComponents();
        addMouseListener(this); //add mouse listener               
    }
    
    
    @Override //drawing component
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draws all shapes that is created
        for (int i = 0; i <= numberOfShapes; i++) {
            //check if rectangle, sets shape to rectangle and draws a rectangle
            if(shapes[i] instanceof Rectangle){
             Rectangle otherRect = (Rectangle) shapes[i];
                g.drawRect((int)otherRect.getQ().getX(), (int)otherRect.getQ().getY(), (int)otherRect.getQ().distance(otherRect.getW()),  (int)otherRect.getW().distance(otherRect.getE()));
            }
            //check if triangle, sets shape to triangle and draws 3 lines to form triangle
            else if (shapes[i] instanceof Triangle)
            {
                Triangle otherTri = (Triangle) shapes[i];
                
                g.drawLine((int)otherTri.getA().getX(), (int)otherTri.getA().getY(), (int)otherTri.getB().getX(), (int)otherTri.getB().getY());
                g.drawLine((int)otherTri.getB().getX(), (int)otherTri.getB().getY(), (int)otherTri.getC().getX(), (int)otherTri.getC().getY());
                g.drawLine((int)otherTri.getA().getX(), (int)otherTri.getA().getY(), (int)otherTri.getC().getX(), (int)otherTri.getC().getY());
                
            }
            //check if line, sets shape to line and draws a line with given points
            else if (shapes[i] instanceof Line){
                Line otherLn = (Line) shapes[i];
                g.drawLine((int)otherLn.getA().getX(),(int)otherLn.getA().getY(),(int)otherLn.getB().getX(),(int)otherLn.getB().getY());
            }
        }
    }
    
    //rotate all shape method, parameter degree from user text box
    public void rotateAll(double degree) {
        //goes through all available shape that have drawn
        for (int i = 0; i <= numberOfShapes; i++) {
            //check if any of the 3 shapes
            if ((shapes[i] instanceof Triangle) || (shapes[i] instanceof Rectangle) || (shapes[i] instanceof Line)) {
                //rotate them user inputed angle
                shapes[i].rotate(degree);
            }
        }
    }
    //translate all method, parameter y and x value from user text box
    public void transAll(double dx, double dy){
        //goes through all available shape that have drawn
        for (int i = 0; i <= numberOfShapes; i++) {
            //check if any of the 3 shapes
            if ((shapes[i] instanceof Triangle) || (shapes[i] instanceof Rectangle) || (shapes[i] instanceof Line)) {
               //translate all the shapes up/down or left/right 
                shapes[i].translate(dx,dy);
            }
        }
        
    }
    
    //Scale all method, parameter user inputed scaling
    public void scaleAll(double multiplier)
    {
        //goes through all available shape that have drawn
        for (int i = 0; i <= numberOfShapes; i++) {
            //check if any of the 3 shapes
            if ((shapes[i] instanceof Triangle) || (shapes[i] instanceof Rectangle) || (shapes[i] instanceof Line)) {
                //scale all the shape smaller or bigger depending multiplier > 1 or < 1
                shapes[i].scale(multiplier);
            }
        }
        
    }
    //animation all shape method, supposed to create a bouncy pendulum effect
    private void animateMovements(){       
        // manipulate/translate the shape up or down, will increasingly bounce up/down
        bounceCounter += 2;
        transAll(0,bounceCounter);
        if (bounceCounter == 10){
            bounceCounter = -12;
        }
        // manipulate the shape clockwise or counter clockwise increasingly
        animateTheta += rotateDirection; 
        
        //rotate all according to the theta 
        rotateAll(animateTheta);
        
        //prevents over rotate, and swings/rotate back the other way
        if (animateTheta < -5 ){
            rotateDirection += 1;
        }
        else if (animateTheta > 5){
            rotateDirection -= 1;
        }
    }
    
    //animate timer toggle starter/stopper
    public void anim() {
        //if not animating
        if (animating == false){
            //starts animation
            animationTimer.start();
            animating = true;
        }
        else //if animating will stop
        {
            animationTimer.stop();
            animating = false;          
            repaint();
           
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //mouse click listeners ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    //click
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override //press
    public void mousePressed(MouseEvent me) {
    }
    
    @Override
    //when user releases their mouse
    public void mouseReleased(MouseEvent me) {
        
        //if drawing mode on
        if (drawing == true) {
            //fills in the users first point click
            if (clickPoint1 == null) {
                clickPoint1 = new Point((int) me.getX(), (int) me.getY());
            } else if (clickPoint2 == null) { //fills in the users second point with click
                clickPoint2 = new Point((int) me.getX(), (int) me.getY());
            }
            //if second point is filled in
            if (!(clickPoint2 == null)) {
                //drawing mode off
                drawing = false;
                //check if line
                if (currentShape == paintFrame.LINE) {
                    //draws a line
                    shapes[numberOfShapes] = new Line(clickPoint1, clickPoint2);
                }  
                //check if rectangle
                else if (currentShape == paintFrame.RECTANGLE) {
                    //if user presses in a weird way, it will proper draw a rectangle accordingly to what they clicked to
                    
                    //if second click is left of first, and second click is lower than first
                    if ((clickPoint1.getX() > clickPoint2.getX()) && (clickPoint1.getY() > clickPoint2.getY())) {
                        shapes[numberOfShapes] = new Rectangle(clickPoint2, new Point((int) clickPoint1.getX(), (int) clickPoint2.getY()), clickPoint1, new Point((int) clickPoint2.getX(), (int) clickPoint1.getY()));

                    } 
                    //if second click is right of first, and second click is lower than first
                    else if ((clickPoint1.getX() < clickPoint2.getX()) && (clickPoint1.getY() > clickPoint2.getY())) {
                        shapes[numberOfShapes] = new Rectangle(new Point((int) clickPoint1.getX(), (int) clickPoint2.getY()), clickPoint2, new Point((int) clickPoint2.getX(), (int) clickPoint1.getY()), clickPoint1);
                    } 
                    //if second click is right  of first, and second click is higher than first
                    else if ((clickPoint1.getX() < clickPoint2.getX()) && (clickPoint1.getY() < clickPoint2.getY())) {
                        shapes[numberOfShapes] = new Rectangle(clickPoint1, new Point((int) clickPoint2.getX(), (int) clickPoint1.getY()), clickPoint2, new Point((int) clickPoint1.getX(), (int) clickPoint2.getY()));
                    } 
                    //if second click is left of first, and second click is higher than first
                    else {
                        shapes[numberOfShapes] = new Rectangle(new Point((int) clickPoint2.getX(), (int) clickPoint1.getY()), clickPoint1, new Point((int) clickPoint1.getX(), (int) clickPoint2.getY()), clickPoint2);
                    }
                } 
                //check if drawing a triangle
                else if (currentShape == paintFrame.TRIANGLE) {
                    //finds the mid point, and height
                    //x mid point:  the most left point + the average/middle of the two clickedp oints
                    //y height: use pythagorean theorm then add to the most left point c = point 1 to 2, a = the left point to the middle
                    int dx,dy;
                    //if click 1 is the most left
                    if (clickPoint1.getX() < clickPoint2.getX()) {
                        dx = (int) (clickPoint1.getX() + (clickPoint1.distance(clickPoint2) / 2));
                        dy = (int) ((clickPoint1).getY() + Math.sqrt(Math.pow(clickPoint1.distance(clickPoint2), 2) - Math.pow((clickPoint1.distance(clickPoint2) / 2), 2)));

                    }
                    //if click 2 is the most left
                    else {
                        dx = (int) (clickPoint2.getX() + (clickPoint1.distance(clickPoint2) / 2));
                        dy = (int) ((clickPoint2).getY() + Math.sqrt(Math.pow(clickPoint1.distance(clickPoint2), 2) - Math.pow((clickPoint1.distance(clickPoint2) / 2), 2)));
                    }
                    //draws shape accordingly to the calculated scuff mid point that was supposed to make a equillateral
                    
                    shapes[numberOfShapes] = new Triangle(clickPoint1, new Point(dx, dy), clickPoint2);

                }
                //repaint the new shape made
                repaint();

            }

        }

    }
        

    @Override
    //mouse is on the application
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    //mouse is not on the application
    public void mouseExited(MouseEvent me) {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
//private class for timer
    private class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //animates the shape instructions created
            animateMovements();
            //repaint the animations
            repaint();
        }

    }
}
