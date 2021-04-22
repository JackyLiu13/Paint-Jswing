/**
 * Jacky Liu
 * ICS4U Period 1
 * Mr. Roy-Diclemente
 * April 6 2021
 * Object Orientated Programming challenges with Shapes 
 */
package paint.program;

/**
 *
 * @author Jacky
 */
public class PaintProgram {

    /** Main where the code runs
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Test Case Points~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~POINT~~~~~~~~~~~~~");
        Point pA = new Point();
        Point pB = new Point(2,2);
        Point pC = new Point(-2,-2);
        
        
        //est adding
        pA.add(pC); //test neg value
        System.out.println(pA);
        pA = new Point();
        pA.add(pB); //test post val
        System.out.println(pA);
        
        //test area should be 0
        System.out.println(pA.area());
        
        //test equals
        System.out.println(pA.equals(pB));
        System.out.println(pA.equals(pC));
                
        //test length + distance
        System.out.println(pA.length());
        System.out.println(pA.distance(pC));
        
        pA = new Point(); //test a point at origin
        pA.scale(-3.123123);
        System.out.println(pA);
        pA = pB;
        //scale
        pA.scale(-2); //test neg
        System.out.println(pA);
        pA.scale(-0.5);//test neg decimal to rescale back
        System.out.println(pA);
        
        //translate
        pA.translate(-2.5, -2.5);
        System.out.println(pA);        
        pA.translate(2.5, 2.5);
        System.out.println(pA);
        pA = new Point(-4,4);
        
        //rotations
        pA.rotate(90);
        System.out.println(pA);
        pA.rotate(-90);        
        System.out.println(pA);
        
        pA.rotate(66);
        System.out.println(pA);
        pA.rotate(-66);        
        System.out.println(pA);      
        
        
        //Line~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~LINE~~~~~~~~~~~~~");
        Point lPA = new Point(-2,-2);
        Point lPB = new Point(-2,2);
        Point lPC = new Point (2,2);
        Point lPD = new Point (2,-2);
        
        Line lA = new Line();
        Line lB = new Line(lPA,lPC);//diangle
        Line lC = new Line(lPA,lPB);//horizontal
        Line lD = new Line(lPA,lPD);//vertical
        Line lE = new Line(lPA);
        
        lA.scale(231231.412); //scales nothing
        System.out.println(lA.toString()); 
        lB.scale(-2);     
        System.out.println(lB.toString());
        lC.scale(0.5);
        System.out.println(lC.toString());
        lD.scale(2.5);
        System.out.println(lD.toString());
                
        lB.translate(0, 0);
        System.out.println(lB.toString());
        lB.translate(2, 2);        
        System.out.println(lB.toString());
        lB.translate(-2,-2);
        System.out.println(lB.toString());
        
        lB.rotate(90);        
        System.out.println(lB.toString());
        lB.rotate(-90);
        System.out.println(lB.toString());
                
        System.out.println(lE.area());
        System.out.println(lE.equals(lA));
        lB = new Line(lPA,lPC);
        lA = new Line(lPA,lPC);
        System.out.println(lB.equals(lA));
        
        //Rectangle~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~RECTANGLE~~~~~~~~~~~~~");
        Point rPA = new Point(-2,-3);
        Point rPB = new Point(-2,3);
        Point rPC = new Point (2,3);
        Point rPD = new Point (2,-3);
        
        Line rLA = new Line(rPA,rPB);
        Line rLB = new Line(rPB,rPC);
        Line rLC = new Line(rPC,rPD);
        Line rLD = new Line(rPD,rPA);
        
        Rectangle rPABCD = new Rectangle (rPA,rPB,rPC,rPD);        
        Rectangle rLABCD = new Rectangle (rLA,rLB,rLC,rLD);
        
        System.out.println(rPABCD.equals(rLABCD));
        System.out.println(rLABCD.toString());
        rPABCD.scale(4);
        System.out.println(rPABCD.toString());
        
        rPABCD.translate(4,4);
        System.out.println(rPABCD.toString());
        rPABCD.translate(-4,-4);
        System.out.println(rPABCD.toString());
        
        
        rPABCD.rotate(90);
        System.out.println(rPABCD.toString());
        rPABCD.rotate(-90);
        System.out.println(rPABCD.toString());
        
        System.out.println(rPABCD.area());
        
        //Square~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~SQUARE~~~~~~~~~~~~~");
        Point sPA = new Point(-3,-3);
        Point sPB = new Point(-3,3);
        Point sPC = new Point (3,3);
        Point sPD = new Point (3,-3);
        
        Line sLA = new Line(sPA,sPB);
        Line sLB = new Line(sPB,sPC);
        Line sLC = new Line(sPC,sPD);
        Line sLD = new Line(sPD,sPA);
        
        Rectangle sPABCD = new Rectangle (sPA,sPB,sPC,sPD);        
        Rectangle sLABCD = new Rectangle (sLA,sLB,sLC,sLD);
       
        System.out.println(sPABCD.equals(sLABCD));
        
        System.out.println(sLABCD.toString());
        sPABCD.scale(4);
        System.out.println(sPABCD.toString());
        
        sPABCD.translate(4,4);
        System.out.println(sPABCD.toString());
        sPABCD.translate(-4,-4);
        System.out.println(sPABCD.toString());
        
        sPABCD.rotate(90);
        System.out.println(sPABCD.toString());
        sPABCD.rotate(-90);
        System.out.println(sPABCD.toString());
        
        System.out.println(sPABCD.area());
        
        //triangle
        System.out.println("~~~~~~~~~~~~~TRIANGLE~~~~~~~~~~~~~");
        Point tPA = new Point(-4,-4);
        Point tPB = new Point(-4,4);
        Point tPC = new Point (4,4);
        
        Line tLA = new Line(tPA,tPB);
        Line tLB = new Line(tPB,tPC);
        Line tLC = new Line(tPC,tPA);
        
        Triangle tPABC = new Triangle (tPA,tPB,tPC);        
        Triangle tLABC = new Triangle (tLA,tLB,tLC);
       
        System.out.println(tPABC.area());
        
        
        System.out.println(tLABC.equals(tPABC));
        
        System.out.println(tLABC.toString());
        tPABC.scale(4);
        System.out.println(tPABC.toString());
        
        tPABC.translate(4,4);
        System.out.println(tPABC.toString());
        tPABC.translate(-4,-4);
        System.out.println(tPABC.toString());
        
        System.out.println(tPABC.area());        
        tPABC.rotate(90);        
        System.out.println(tPABC.area());
        System.out.println(tPABC.toString());
        tPABC.rotate(-90);
        System.out.println(tPABC.toString());
        System.out.println(tPABC.area());
        System.out.println(tLABC.area());
        
        
        
        //Comparing other shapes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~Other Shapes~~~~~~~~~~~~~");
        System.out.println(rLABCD.equals(tLABC)); //rect and tri
        System.out.println(rLABCD.equals(lE)); //rect and line
        System.out.println(rLABCD.equals("string :)")); //rect and string
        System.out.println(rLABCD.equals(sLABCD)); //rect and square
        System.out.println(rLABCD.equals(tPC)); //rect and point
        System.out.println(lE.equals(pA)); //line and point
        tPC.scale(0.5);
        System.out.println(tPC.equals(lPC)); //point and point
        
        Point p1 = new Point(2,2);
        Point p2 = new Point(2,-2);
        Point p3 = new Point(-2,-2);
        Point p4 = new Point(-2,2);
        
        Rectangle r1 = new Rectangle(p1,p2,p3,p4);
        Square s1 = new Square(p1,p2,p3,p4);
        Triangle t1 = new Triangle(p1,p2,p3);
        Line l1 = new Line(p1,p2);
        System.out.println(r1.equals(s1)); //a square is a rect
        System.out.println(s1.equals(r1));//but a rect is not a square
        System.out.println(s1.equals(t1));
        System.out.println(r1.equals(t1));
        System.out.println(t1.equals(l1));
        System.out.println(s1.equals(l1));
        System.out.println(r1.equals(l1));

        
        
        
        
        
        
        
        
//            System.out.println("OTHER TESTING");
//        Point p = new Point (-2,-2);
//        Point o = new Point (2,-2);
//        Point i = new Point (2,2);
//        Point u = new Point (-2,2);
//        Point g = new Point (-4,5);
//        
//        Triangle f = new Triangle (p,o,i); 
//        System.out.println(f.area());
//        
//        
//        
//        Square w = new Square (p,o,i,u);
//        System.out.println(w.area());
//        Rectangle e = new Rectangle (p,o,i,u);
//        System.out.println(e.equals(w));
//        System.out.println(w);
//        System.out.println(w.area());
//        w.scale(2);
//        System.out.println(w);
//        w.scale(0.5);
//        System.out.println(w);
//        w.translate(2, 2);
//        System.out.println(w);
//        w.rotate(180);
//        System.out.println(w);
//        
//        
//        
//        Point adder = new Point(0,0);
//        
//        adder.add(p);
//        System.out.println(adder.toString());
//        adder = new Point();
//        adder.add(o);
//        System.out.println(adder.toString());
//        adder.add(i);
//        System.out.println(adder.toString());
//        adder = new Point (0,0);
//        adder.add(u);
//        System.out.println(adder.toString());
//        
//        
//        System.out.println(p.distance(o));
//        System.out.println(o.distance(p));
//        System.out.println(o.distance(i));
//        System.out.println(u.distance(i));
//        System.out.println(p.distance(u));
//                
//        System.out.println(p.distance(p));
//        
//        System.out.println(p.length());
//        System.out.println(o.length());
//        System.out.println(i.length());
//        System.out.println(u.length());
//        
//        System.out.println(p.equals(p));        
//        System.out.println(p.equals(i));
//        System.out.println(p.equals(o));        
//        System.out.println(p.equals(u));
//        
//        p.scale(4);
//        i.scale(4);
//        o.scale(4);
//        u.scale(4);
//        System.out.println(p+ " " + i+ " " + o + " " +u);
//        i.scale(-4);
//        System.out.println(i);
//        p.translate(4, 0);
//        p.translate(0, 4);
//        System.out.println(p.toString());
//        p.translate(-8, 0);
//        p.translate(0, -8);
//        
//        System.out.println(p.toString());
//        
//        
//        Point bruv = new Point(0,0);
//        System.out.println("line");
//        p = new Point(-2,-2);
//        Line l = new Line(bruv,bruv);
//        Line k = new Line(u,p);
//        Line j = new Line(p, bruv);
//        System.out.println(k.toString());
//        k.scale(-2);
//        System.out.println(k.toString());
//        k.translate(2, 2);        
//        System.out.println(k.toString());
//        k.rotate(180);
//        System.out.println(k.toString());
//        System.out.println(k.equals(j));
//        System.out.println(k.equals(k));
//        System.out.println("bruv");
//        
//        Point d = new Point (2,-3);
//        Point c = new Point (2,0);
//        Point b = new Point (0,0);
//        Point a = new Point (0,-3);
//                
//        Rectangle z = new Rectangle (a,b,c,d);
//        System.out.println(z.toString());
//        System.out.println(z.equals(w));
//                
//        System.out.println(z.area());
//        z.scale(4);
//        System.out.println(z.area());
//        
//        
//        Line gg = new Line(d,c);
//        Line ee = new Line(c,d);
//        
//        System.out.println(ee.equals(gg));
//        
//        a.rotate(180);
//        System.out.println( a.toString());
    }
    
}
