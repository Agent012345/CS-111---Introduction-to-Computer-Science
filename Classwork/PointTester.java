public class PointTester{

    public static void main(String[] args){

        //data_type variable_name = new data_type(...)
        Point p = new Point();
        System.out.println(p.getX()); //x-coord of p
        System.out.println(p.getY()); //y-coord of p

        //create another point q (3,4);
        Point q = new Point(3,4);
        p.setX(5);
        double slope = p.findSlope(q);
        System.out.println(slope);
        /*System.out.println(q.getX());
        System.out.println(q.getY());*/
        double distance = p.findDistance(q);
        System.out.println(distance);
        System.out.println(p.findMidpoint(q));
    }

}