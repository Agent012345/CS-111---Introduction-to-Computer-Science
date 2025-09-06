public class IO{
    public static void main (String[] args) {
        System.out.println("Enter an integer: ");
        int x = StdIn.readInt();
        System.out.println("Enter another integer: ");
        int y = StdIn.readInt();
        int sum = x + y;
        System.out.println(sum);
    }
}