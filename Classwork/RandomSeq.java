public class RandomSeq{
    public static void main (String[] args) {
        
        //read an integer n
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i<n; i++){
            System.out.println(Math.random());
        }
    }
}