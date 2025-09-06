
import java.io.SequenceInputStream;

public class FunctionsPart2{

    public static int countEven(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    //Write a function that takes in an array of integers and divides each value by 2
    public static void halve(int[] a){
        for(int i = 0; i<a.length; i++){
            a[i]/=2; //a[i] = a[i] / 2
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 9, 1, 2, 5, 6, 2, 10};
        halve(arr);
        for (int elt : arr){
            System.out.println(elt + " ");
        }/*int numEvens = countEven(arr);
        System.out.println(countEven(arr)); */
    }
}