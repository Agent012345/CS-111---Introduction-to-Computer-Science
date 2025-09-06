public class NumProbs{

    //modifiers, return type, name, inputs
    public static int factorial(int n){
        //n! = n * n-1 * n-2 * ..... * 1
        int fact = n;    
        for (int i = n-1; i > 1; i--){
                fact = fact * i;
                //n * n-1
                //n * n-1 * n-2
            }
            return fact;
    }

    public static int pow(int base, int exponent){

        //return that value of base ^ exponent
        //HINT: b*e
        int prod = 1;
        for (int i = exponent; i > 0; i--){

            prod = prod * base;
            //1 * b
            //1*b*b
            //1*b*b*b

            }
            return prod;
        }

    public static void main(String[] args){
        //java NumProbs 8
        int n = Integer.parseInt(args[0]);
        int x = factorial(n);
        //int x = StdIn.readInt();
        System.out.println(x);
        System.out.println(pow(2,4));
    }
}