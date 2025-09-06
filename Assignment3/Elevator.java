
/*************************************************************************
 *  Compilation:  javac Elevator.java
 *  Execution:    java Elevator 'number of floors' 'floor requests' 'number of restricted floors' 'optional passcode'
 *
 *  @author Pooja Kedia
 *  @author Vidushi Jindal
 *
 *************************************************************************/
public class Elevator {
    
    public static void main ( String[] args ) {

        int numberOfFloors = Integer.parseInt(args[0]);
        int request = Integer.parseInt(args[1]);
        int restrictedFloors = Integer.parseInt(args[2]);
        int requestedFloor;

        int Elevator1 = 1;
        int Elevator2 = 1;

        while(request > 0){
            requestedFloor = request % 10;
            request = request / 10;
            int distance1 = Math.abs(requestedFloor - Elevator1);
            int distance2 = Math.abs(requestedFloor - Elevator2);
            if ((distance1 == distance2) || (distance1 < distance2)){
                Elevator1 = requestedFloor;
                System.out.print("1 ");
            }
            else{
                if (distance2 < distance1){
                Elevator2 = requestedFloor;
                System.out.print("2 ");
                }
            }
            System.out.println(requestedFloor);
            if ((restrictedFloors > 0) && (requestedFloor > numberOfFloors - restrictedFloors)){
                int optionalPasscode = Integer.parseInt(args[3]);
                if ((optionalPasscode % numberOfFloors == requestedFloor) || ((optionalPasscode % numberOfFloors == 0) && (requestedFloor == numberOfFloors))){
                    System.out.println("Granted");
            }
                else{
                    System.out.println("Denied");
                }
            }
        }
    }
}