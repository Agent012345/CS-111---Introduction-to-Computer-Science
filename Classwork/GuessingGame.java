public class GuessingGame{
    public static void main (String[] args) {
        
        int n = (int) Math.random()*100+1;
        System.out.print("Pick a number: ");
        int x = StdIn.readInt();
        if (x>n){
            System.out.println("Too High!");
        }
        else{
            if (x<n){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("You got it!");
            }
        }
    }
}