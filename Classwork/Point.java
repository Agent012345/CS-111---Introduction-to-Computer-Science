public class Point{

    //instance variables - set of values that describes your data type
    private int x; //Private: makes data type secure and only accessible in this file (Security mechanism)
    private int y; //Class is to blueprint as object is to house being built (Instance is one possible object)

    //constructor(s)
    public Point(){ //default constructor (Point p = new Point())
        x = 0;
        y = 0;
    }

    public Point(int xval, int yval){ //Point p = new Point(5,6)
        x = xval;
        y = yval;
    }

    //operations

    //accessor/getter methods
    public int getX(){ //p.getx();
        return x;
    }

    public int getY(){ //p.gety();
        return y;
    }

    public void setX(int newXVal){ //p.setX(5)
        x = newXVal;

    }

    public double findSlope(Point other){ //p.findslope(q)
        //(y2-y1)/(x2-x1)
        int x2 = other.getX();
        int y2 = other.getY();
        int x1 = x;
        int y1 = y;
        return (double) (y2-y1)/(x2-x1);
    }

    public double findDistance(Point other){ //p.findDistance(q)
        int x2 = other.getX(); //q's x
        int y2 = other.getY(); //q's y
        int x1 = x; //p's x
        int y1 = y; //p's y
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public Point findMidpoint(Point other){ //p.findMidpoint(q)
        ///xMid = (x1+x2)/2
        //yMid = (y1+y2)/2
        int x2 = other.getX();
        int y2 = other.getY();
        int x1 = x;
        int y1 = y;
        int xMid = (x1 + x2)/2;
        int yMid = (y1 + y2)/2;
        Point mid = new Point(xMid, yMid);
        return mid;
    }

    public String toString(){
        //(x,y)
        String str = "x: " + x + " y: " + y;
        //x: 0 y: 5
        //String str = "("+ x + ", " + y + ")";
        return str;
    }

    //s1.equals(s2)
    public boolean equals(Point other){ //p.equals(q)
        if (x == other.getX() && y == other.getY()){
            return true;
        }    
        else{
            return false;
        }
    }
    //p == q (Location in memory)
    

}