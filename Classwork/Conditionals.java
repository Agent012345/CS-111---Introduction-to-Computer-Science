public class Conditionals{

    public static void main(String[] args){
        /*int anaCats = Integer.parseInt(args[0]); //READ anaCats
        int ellenCats = Integer.parseInt(args[1]); //READ ellenCats
        if (anaCats < 0 || ellenCats < 0)
            System.out.println("error"); //IF (anaCats < 0 OR ellenCats < 0) THEN DISPLAY error
        else{
            int totalCats = anaCats + ellenCats; //COMPUTE totalCats AS anaCats + ellenCats
            System.out.println(totalCats); //DISPLAY totalCats
        }*/
    
    double hoursWorked = Double.parseDouble(args[0]); //READ hoursWorked
    double ratePerHour = Double.parseDouble(args[1]); //READ ratePerHour
    if (hoursWorked < 0 || ratePerHour < 0)
        System.out.println("error");
    else{
        double totalPay = hoursWorked * ratePerHour; //COMPUTE totalPay AS hoursWorked * ratePerHour
        System.out.println("The total pay is: $" + totalPay); //DISPLAY totalPay
        }
    }
}