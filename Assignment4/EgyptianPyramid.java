
/**
 * Compilation: javac EgyptianPyramid.java
 * Execution:   java EgyptianPyramid 'size of grid' 'number of initial blocks'
 *
 * @author Ayla Muminovic
 * @author Kushi Sharma
 *
 * DO NOT change the class name DO NOT use System.exit() DO NOT change add
 * import statements DO NOT add project statement
 */
public class EgyptianPyramid {

    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);
        int bricksProvided = Integer.parseInt(args[1]);
        char[][] egyptianPyramid = new char[size][size];
        int i;
        int j;
        int bricksRemaining = bricksProvided;
        for (i = 0; i <= egyptianPyramid.length - 1; i++) {
            for (j = 0; j <= egyptianPyramid[i].length - 1; j++) {
                if (j >= i && j < egyptianPyramid[i].length - i) {
                    if (bricksRemaining > 0) {
                        egyptianPyramid[i][j] = 'X';
                        bricksRemaining = bricksRemaining - 1;
                    } else {
                        egyptianPyramid[i][j] = '=';
                    }
                } else {
                    egyptianPyramid[i][j] = '=';
                }

               
            }
        }
        for (i = egyptianPyramid.length - 1; i >= 0; i--) {
            for (j = 0; j <= egyptianPyramid[i].length - 1; j++) {
                System.out.print(egyptianPyramid[i][j]); //How would I print it backwards?
            }
            System.out.println();

        }

        System.out.println(bricksRemaining + " Bricks Remaining");
    }
}
