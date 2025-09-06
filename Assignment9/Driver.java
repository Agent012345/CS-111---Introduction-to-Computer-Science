
public class Driver {
    /**
     * Navigate to the RURacing directory and compile the files using the following:
     * Compilation: javac -d bin *.java
     * Execution: java -cp bin Driver
     */
    public static void main(String[] args) {
        // Compilation: javac -d bin src/ruracing/Driver.java
        // Execution: java -cp bin ruracing.Driver
        // use -ea option when running, helps verify test cases

        // You will be responsible for implementing the methods in RURacing.java
        // To test your implementation you must create your own test cases
        // and verify that your implementation is correct. All methods will be
        // tested through RURacing.methodName() calls.

        System.out.println("Enter a file name: ");
        String inputFile = StdIn.readLine();
        System.out.println();
        int[] corners = RURacing.readTrackFile(inputFile);
        char[][] map = RURacing.createRaceway(corners);
        RURacing.printMap(map);
        System.out.println();
        System.out.println("Select a racer to test: ");
        StdIn.resync();
        String input = StdIn.readLine();
        System.out.println();

        if (input.equals("racer1")){
            RURacing.racer1(map);
            System.out.println();
            RURacing.printMap(map); //COMMENT OUT
        }
        if (input.equals("racer2")){
            RURacing.racer2(map);
            System.out.println();
            RURacing.printMap(map); //COMMENT OUT
        }
        if (input.equals("racer3")){
            RURacing.racer3(map);
            System.out.println();
            RURacing.printMap(map); //COMMENT OUT
        }
        if (input.equals("racer4")){
            RURacing.racer4(map);
            System.out.println();
            RURacing.printMap(map); //COMMENT OUT
        }
    }
}
