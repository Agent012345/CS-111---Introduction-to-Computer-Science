import java.awt.Color;

public class ColorPractice {
    public static void main(String[] args){
        //data_type variable_name = new data_type(arguments)
        Color c1 = new Color(0, 0, 0);
        StdDraw.setPenColor(c1);
        StdDraw.filledCircle(0.5, 0.5, 0.3);
        
        Color c2 = new Color (0, 255, 0);
        StdDraw.setPenColor(c2);
        StdDraw.filledCircle(0.5, 0.5, 0.1);
        
        Color c3 = c2.darker();
        StdDraw.setPenColor(c3);
        StdDraw.filledCircle(0.5, 0.5, 0.05);

        Color c4 = c3.darker();
        System.out.println(c4);
        
        c1.getGreen(); //0
        c2.getGreen(); //255
        System.out.println("R: " + c3.getRed());
        System.out.println("G: " + c3.getGreen());
        System.out.println("B: " + c3.getBlue());

        boolean b = (c1 == c2); //Checks if c1 and c2 are located in the same memory address
        boolean b2 = c1.equals(c2); //Checks red, green, and blue values between both colors

    }    
}
