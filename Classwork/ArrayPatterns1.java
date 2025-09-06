public class ArrayPatterns1{
    public static void main (String[] args) {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        int[] arrFill = new int[one];
        arrFill[0] = two;
        for (int i = 1; i < arrFill.length; i++){
            arrFill[i] = arrFill[i-1]*2;
            System.out.print(arrFill[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<arrFill.length; i++)
            System.out.print(arrFill[i] + " ");
            



    }
}