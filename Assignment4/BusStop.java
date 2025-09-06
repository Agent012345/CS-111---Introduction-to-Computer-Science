/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class BusStop {

    public static void main(String[] args) {

        int n;
        char[] busRoute = new char[args.length-1];
        for (n = 0; n <= args.length - 2; n++) {
            busRoute[n] = args[n].charAt(0);
        }
        char busNeeded = args[args.length - 1].charAt(0);
        int busPosition = -1;
        for (n = 0; n <= busRoute.length - 1; n++) {
            char c = args[n].charAt(0);
            if (busNeeded == c) {
               busPosition = n + 1;
               break;
            }
        }
            System.out.println(busPosition);
    }
}
