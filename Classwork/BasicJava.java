public class BasicJava{
    public static void main (String[] args) {
        /*int anaCats = Integer.parseInt(args[0]); //READ anaCats
        int ellenCats = Integer.parseInt(args[1]); //READ ellenCats
        int totalCats = anaCats + ellenCats; //COMPUTE totalCats AS anaCats + ellenCats
        System.out.println(totalCats); //DISPLAY totalCats*/
        
        int N = Integer.parseInt(args[0]); //6
        double rand = Math.random(); //0 (inclusive) and 1 (exclusive)
        int t = (int)(rand * N) + 1; //integer between 1 (inclusive) and 6 (inclusive)
        System.out.println(t);
    }
}