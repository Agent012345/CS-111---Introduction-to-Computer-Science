public class RingArea{

    public static double calculateArea(double radius){
        //Math.PI
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args){

        double r1 = 7.1284;
        double r2 = 2.498;
        double area1 = calculateArea(r1); //bigger circle
        double area2 = calculateArea(r2); //smaller circle
        double ringArea = area1 - area2;
        System.out.println(ringArea);

    }
}