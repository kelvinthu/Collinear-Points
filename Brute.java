/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Brute {
    
    
    public static void main(String[] args) {
        StdDraw.setXscale(0,32768);
        StdDraw.setYscale(0,32768);
        StdDraw.show(0);
        
        String filename = args[0];
        In in = new In(filename);
        int N = in.readInt();
      
       Object[] p = new Object[N];
         
        for(int i = 0; i < N; i++) {
            int x = in.readInt();
            int y = in.readInt();
            
            Point point = new Point(x,y);
            point.draw();
            p[i] = point;
            
        
    }
        Point[] r = Arrays.copyOf(p,p.length,Point[].class);
        Arrays.sort(r);
        for (int j =0; j <= N-4 ; j++) {
            for (int k = j+1; k <= N-3  ; k++) {
                for (int l =k+1; l <= N-2; l++) {
                    for (int m = l+1; m <= N-1; m++) {
                        if (r[j].slopeTo(r[k])== (r[j].slopeTo(r[l]))){
                            if (r[j].slopeTo(r[k]) == r[j].slopeTo(r[m])) {
                              StdOut.println(r[j].toString() + " -> " + r[k].toString() + " -> " + r[l].toString() + " -> " + r[m].toString());
                              r[j].drawTo(r[m]);
                              StdDraw.show(0);
                           }
                       }
                    
                    }
                }
             }
       
        }
        StdDraw.show(0);
        
    
    /* ADD YOUR CODE HERE */
    
}
}
