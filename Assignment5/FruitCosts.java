
/**
 * FruitCosts
 *
 * 1. This program reads in a list of fruits and their costs from a file (args[0]).
 * 2. Then finds the two lowest cost fruits and prints their names and costs
 * along with the total cost.
 *
 * @author Srimathi Vadivel
 * @author Sarah Benedicto
 */
public class FruitCosts {

    /**
     * Main function to execute the program
     *
     * @param args command-line arguments, where args[0] is the file name to
     * read from
     */
    public static void main(String[] args) {

        // Do not remove this line, it opens the file for reading.
        StdIn.setFile(args[0]);

        // StdIn.readDouble, StdIn.readString() to read from the file
        int nbrFruits = StdIn.readInt();
        String[] fruitNames = new String[nbrFruits];
        double[] fruitCosts = new double[nbrFruits];
        double min = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;
        String minFruit = fruitNames[0];
        String secondMinFruit = fruitNames[0];
        for (int i = 0; i <= nbrFruits - 1; i++) {
            fruitNames[i] = StdIn.readString();
            fruitCosts[i] = StdIn.readDouble();
            if (fruitCosts[i] < min) {
                min = fruitCosts[i];
                minFruit = fruitNames[i];
            }
        }
        for (int i = 0; i <= nbrFruits - 1; i++) {
            if (fruitCosts[i] < secondMin && fruitCosts[i] > min) {
                secondMin = fruitCosts[i];
                secondMinFruit = fruitNames[i];
            }
        }
        double total = min + secondMin;
        StdOut.println(minFruit + " " + min);
        StdOut.println(secondMinFruit + " " + secondMin);
        String formattedTotal = String.format("%.2f", total);
        StdOut.println("Total " + formattedTotal);

    }
}
