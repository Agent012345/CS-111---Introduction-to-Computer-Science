public class LoopsPart2{
    public static void main(String[] args) {
        /* int count = 1; //SET count to 1
        int sum = 0; //SET sum TO 0
        int n = Integer.parseInt(args[0]); //read an integer argument
        while (count <= n){ //WHILE count <= 50
            sum = sum + count; //sum +=count; //ADD count TO sum
            count = count + 1; //count += 1; //ADD 1 TO count
        }
        System.out.println(sum); //DISPLAY sum */
        
        /*int sum = 0; //SET sum TO 0
        int n = Integer.parseInt(args[0]); //read an integer argument
        for (int count = 1; count <= n; count++){
           sum = sum + count;
        }       
        System.out.println(sum);*/
        for (int i = 1; i <= 3; i++){ //outer loop - controls rows
            for (int j = 1; j <= 4; j++){ //inner loop - controls columns
                System.out.print(j + " ");
            }
            System.out.println(); //hit enter
        }
    }
}