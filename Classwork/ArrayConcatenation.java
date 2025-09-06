public class ArrayConcatenation{
    public static void main (String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        b[0] = 4;
        b[1] = 5;
        b[2] = 6;
        int[] c = new int[a.length+b.length];
        int currentIndex = 0;
        for (int i = 0; i < a.length; i++){
            c[currentIndex++] = a[i];}
        for (int j = 0; j < b.length; j++){
            c[currentIndex++] = b[j];}
        for (int k = 0; k < c.length; k++){
            System.out.print(c[k]);}



    }
}