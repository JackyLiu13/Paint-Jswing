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
public class PaintProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Point p = new Point (-2,-2);
        Point o = new Point (-2,2);
        Point i = new Point (2,-2);
        Point u = new Point (2,2);
        
        Point adder = new Point (0,0);
        
        adder.add(p);
        System.out.println(adder.toString());
        adder = new Point();
        adder.add(o);
        System.out.println(adder.toString());
        adder.add(i);
        System.out.println(adder.toString());
        adder = new Point (0,0);
        adder.add(u);
        System.out.println(adder.toString());
        
        
        System.out.println(p.distance(o));
        System.out.println(o.distance(p));
        System.out.println(o.distance(i));
        System.out.println(i.distance(o));
        System.out.println(u.distance(i));
        System.out.println(i.distance(u));
        System.out.println(p.distance(u));
        System.out.println(u.distance(p));
                
        System.out.println(p.distance(p));
        System.out.println(o.distance(o));
        System.out.println(i.distance(i));
        System.out.println(u.distance(u));
        
        System.out.println(p.length());
        System.out.println(o.length());
        System.out.println(i.length());
        System.out.println(u.length());
        
        System.out.println(p.equals(p));        
        System.out.println(p.equals(i));
        System.out.println(p.equals(o));        
        System.out.println(p.equals(u));
        p.scale(4);
        i.scale(4);
        o.scale(4);
        u.scale(4);
        System.out.println(p+ " " + i+ " " + o + " " +u);
        i.scale(-4);
        System.out.println(i);
        p.translate(4, 0);
        p.translate(0, 4);
        System.out.println(p.toString());
        p.translate(-8, 0);
        p.translate(0, -8);
        
        System.out.println(p.toString());
        
        
        System.out.println("line");
        p = new Point(-2,-2);
        Line l = new Line();
        Line k = new Line(u,p);
        Line j = new Line(p);
        System.out.println(k.toString());
        k.scale(-2);
        System.out.println(k.toString());
        k.translate(2, 2);        
        System.out.println(k.toString());
        k.rotate(180);
        System.out.println(k.toString());
        System.out.println(k.equals(j));
        System.out.println(k.equals(k));
        System.out.println("bruv");
        
        Point d = new Point (2,-3);
        Point c = new Point (2,0);
        Point b = new Point (0,0);
        Point a = new Point (0,-3);
                
        Rectangle z = new Rectangle (a,b,c,d);
        Rectangle w = z;        
        System.out.println(z.toString());
        System.out.println(z.equals(w));
                
        System.out.println(z.area());
        z.scale(4);
        System.out.println(z.area());
        
        
        
        a.rotate(180);
        System.out.println( a.toString());
    }
    
}
