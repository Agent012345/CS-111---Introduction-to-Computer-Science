/*************************************************************************
 * Compilation: javac QuadraticKoch.java
 * Execution: java QuadraticKoch n
 *
 * @author Jeremy Hui
 *
 *************************************************************************/
public class QuadraticKoch {

    /**
     * Gets the set of coordinates to draw one segment of the Quadratic Koch Curve.
     * Returns the coordinates in a 2D array of doubles in the following format:
     * {array of x-coordinates,
     * array of y-coordinates}
     * 
     * @param x0 the x-coordinate of one endpoint
     * @param y0 the y-coordinate of one endpoint
     * @param x5 the x-coordinate of the other endpoint
     * @param y5 the y-coordinate of the other endpoint
     * @return the set of coordinates to draw one segment of the Quadratic Koch
     *         Curve
     */
    public static double[][] getCoords(double x0, double y0, double x5, double y5) {
        double distance = Math.sqrt(Math.pow((x5-x0), 2) + Math.pow((y5-y0), 2));
        double distanceThirds = distance/3;
      
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        double x4;
        double y4;
        if (x0 == x5 && y5 > y0){
            x1 = x0;
            y1 = y0 + distanceThirds;
            x2 = x1 - distanceThirds;
            y2 = y1;
            x3 = x2;
            y3 = y2 + distanceThirds;
            x4 = x3 + distanceThirds;
            y4 = y3;
            x5 = x4;
            y5 = y4 + distanceThirds;
        }
        else{
            if (x0 < x5 && y0 == y5){
                x1 = x0 + distanceThirds;
                y1 = y0;
                x2 = x1;
                y2 = y1 + distanceThirds;
                x3 = x2 + distanceThirds;
                y3 = y2;
                x4 = x3;
                y4 = y3 - distanceThirds;
                x5 = x4 + distanceThirds;
                y5 = y4;
            }
            else{
                if (x0 == x5 && y0 > y5){
                    x1 = x0;
                    y1 = y0 - distanceThirds;
                    x2 = x1 + distanceThirds;
                    y2 = y1;
                    x3 = x2;
                    y3 = y2 - distanceThirds;
                    x4 = x3 - distanceThirds;
                    y4 = y3;
                    x5 = x4;
                    y5 = y4 - distanceThirds;
                }
                else{
                    if (x0 == y0 && x5 == y5 && x0 != x5 && y0 != y5){
                        x1 = x0 + 1;
                        y1 = y0 + 1;
                        x2 = x0;
                        y2 = y1 + 1;
                        x3 = x2 + 1;
                        y3 = y2 + 1;
                        x4 = x3 + 1;
                        y4 = y2;
                        x5 = x4 + 1;
                        y5 = y3;
                    }
                    else{
                        x1 = x0 - distanceThirds;
                        y1 = y0;
                        x2 = x1;
                        y2 = y1 - distanceThirds;
                        x3 = x2 - distanceThirds;
                        y3 = y2;
                        x4 = x3;
                        y4 = y3 + distanceThirds;
                        x5 = x4 - distanceThirds;
                        y5 = y4;
                    }
                }
            }
        }

        double[][] coords = {
                        {x0, x1, x2, x3, x4, x5},
                        {y0, y1, y2, y3, y4, y5}
                        };
        return coords;
    }

    /**
     * Gets the set of coordinates from getCoords() to draw the snowflake,
     * and calls Koch on two adjacent array indices with n being one less.
     * The method draws a line between the two endpoints if n == 0.
     * 
     * @param x0 the x-coordinate of one endpoint
     * @param y0 the y-coordinate of one endpoint
     * @param x5 the x-coordinate of the other endpoint
     * @param y5 the y-coordinate of the other endpoint
     * @param n  The current order
     */
    public static void koch(double x0, double y0, double x5, double y5, int n) {
        if (n == 0){
            StdDraw.line(x0, y0, x5, y5);
            }
        if (n > 0) {
            double[][] newCoords = getCoords(x0, y0, x5, y5);
            koch(newCoords[0][0], newCoords[1][0], newCoords[0][1], newCoords[1][1], n-1);
            koch(newCoords[0][1], newCoords[1][1], newCoords[0][2], newCoords[1][2], n-1);
            koch(newCoords[0][2], newCoords[1][2], newCoords[0][3], newCoords[1][3], n-1);
            koch(newCoords[0][3], newCoords[1][3], newCoords[0][4], newCoords[1][4], n-1);
            koch(newCoords[0][4], newCoords[1][4], newCoords[0][5], newCoords[1][5], n-1);
        }
    }

    /**
     * Takes an integer command-line argument n,
     * and draws a Quadratic Koch Curve of order n in a 1 x 1 canvas
     * with an initial square side length of 0.5.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        koch(.25, .25, .25, .75, n);
        koch(.25, .75, .75, .75, n);
        koch(.75, .75, .75, .25, n);
        koch(0.75, 0.25, .25, .25, n);
             

    }
}