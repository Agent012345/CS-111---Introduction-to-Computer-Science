public class Average{
    public static void main (String[] args) {
        //compute + display the average of a stream of doubles from the user
        double sum = 0.0;
        int n = 0; //how many #'s user inputs
        
        while (!StdIn.isEmpty()){ //keep going while input stream is not empty
            double x = StdIn.readDouble();
            sum = sum + x;
            n = n + 1;
        }
        StdOut.println(sum/n);
    }
}