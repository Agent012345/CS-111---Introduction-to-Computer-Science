public class Bunnies{
    
    public static int bunnyEars(int bunnies){
        if (bunnies ==0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies-1);
    }
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(bunnyEars(n));
    }
}