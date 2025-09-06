public class Arrays {
    public static void main(String[] args) {
        
        int[] a = new int[6]; //created an integer array of size 6
        System.out.println(a.length); //display 6 (length of array)
        a[0] = 2;
        a[1] = 4;
        a[2] = 6;
        a[3] = 8;
        a[4] = 10;
        a[5] = 12;
        for (int i = 0; i < a.length /*<= a.length -1 */; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        //print array in reverse
        for (int i = a.length-1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}