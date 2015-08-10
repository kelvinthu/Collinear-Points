/**
 * Auto Generated Java Class.
 */
import java.util.Comparator;

public class Point implements Comparable<Point> {
    public final Comparator<Point> SLOPE_ORDER = new SlopeOrder();
    
    private final int x;
    private final int y;
    
    public Point(int x, int y) { 
        this.x = x;
        this.y = y;
        
    }
    private class SlopeOrder implements Comparator<Point> {
        public int compare (Point p, Point q) {
            if (p.slopeTo(Point.this) < Point.this.slopeTo(q)) {
                return -1;
            }
            else if(p.slopeTo(Point.this) == Point.this.slopeTo(q)) {
                return 0;    
            }
            else {
            return +1;
            }
        }
    }
    public void draw() {
        StdDraw.point(x,y);
    }
    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double slopeTo(Point that) {
        double num = (double) that.y - this.y;
        double den = (double) that.x - this.x;
        if (num == 0 && den == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        else if (num == 0 && den !=0) {
            return 0.0;
        }
        else if (num !=0 && den == 0) {
            return Double.POSITIVE_INFINITY;
        }
        else {
            return num/den;
        }
       
    }
    
    public int compareTo(Point that) {
         if(this.y < that.y) return -1;
        else if (this.y == that.y) {
            if (this.x < that.x) return -1;
            else if (this.x > that.x) return +1;  
            else return 0;
        }
        else  return +1;
       
    }
    
    public static void main(String[] args) { 
        Point p = new Point (3,5);
        Point q = new Point (3,5);
        Point r = new Point (3,5);
        StdOut.println(p.slopeTo(q));
        StdOut.println(p.slopeTo(r));
        StdOut.println(p.SLOPE_ORDER.compare(q,r));
        
    }
    
    /* ADD YOUR CODE HERE */
    
}
