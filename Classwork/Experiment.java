
public class Experiment {

    public static int powerOfTwo(int i) {
        i *= i;
        System.out.println(i);
        return i;
    }
    public static void main(String[] args) {
        /* int t = 14;
        double c = t;
        System.out.println(c); */

 /* String[] a = new String[args.length];
        for (int i = 0; i < a.length; i++){
            a[i] = args[i];
            if (i < a.length-1){
                System.out.print(a[i] + ", ");
            }
            else{
                System.out.print(a[args.length-1]);
            }
        } */

 /* int a = 5;
        double b = a;
        System.out.println(b); */
 /* double product = ((double) 7/2)*2.0;
        System.out.println(product); */

 /* int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean isEqual;
        isEqual = a == b;
        System.out.println(isEqual); */

 /*int count = 1;
        int sum = 0;
        while (count<=50)
            sum = sum + count;
            count++;
        System.out.println(sum);*/

 /* int number = Integer.parseInt(args[0]);
        int sum = 0;
        while (number > 0){
            int digit = number%10;
            sum += digit;
            number = number/10;
        }
        System.out.println(sum); */
 /* int a = Integer.parseInt(args[0]);
        boolean isEqual;
        isEqual = a == 1;
        if (isEqual == true)
            System.out.println("You win!" + " " + isEqual);
        else
            System.out.println("You lose!" + " " + isEqual); */

 /* int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (b < a)
        { int t = a; a = b; b = t; }
        if (c < a)
        { int t = a; a = c; c = t; }
        if (c < b)
        { int t = b; b = c; c = t; }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); */

 /* int N = Integer.parseInt(args[0]);
    int sum = 0; 
    for (int i = 1; i <= N; i++)
        sum += i;
    System.out.println(sum); */
 /*int N = Integer.parseInt(args[0]);
    int v = 1;
    while (v <= N/2)
        v = 2*v;
    System.out.println(v); */

 /* int N = Integer.parseInt(args[0]);
    String ruler = " ";
    for (int i = 1; i <= N; i++)
        ruler = ruler + i + ruler;
    System.out.println(ruler); */

 /* int n = Integer.parseInt(args[0]);
    for (int i=0; i < n ; i++) {
        if ( i == 11)
            break;
        System.out.println(i);
        } */
 /* int n = Integer.parseInt(args[0]);
    for (int i=0; i < n ; i++) {
        if ( i == 11)
            continue;
        System.out.println(i);
        } */

 /* long n = Long.parseLong(args[0]);
        for ( int i = 2; i <= n/i; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
                }
            }
        if (n > 1) 
            System.out.println(n);
        else 
            System.out.println(); */

 /* int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[0]);
    int c = Integer.parseInt(args[0]);
    int min;
    if (a < b){
        if (a < c){
            min = a;
            System.out.println(min);}
        else{
            min = c;
            System.out.println(min);}}
    else{
        if (b < c){
            min = b;
            System.out.println(min);}
        else{    
            min = c;
            System.out.println(min);}} */
 /* long n = Long.parseLong(args[0]);
    for ( int i = 2; i <= n; i++){
        while (n % i == 0){
            System.out.println(i + " ");
            n = n / i;
            }
        System.out.println("TRACE " + i + " " + n);
        } */
 /* int weight = Integer.parseInt(args[0]);
    double height = Double.parseDouble(args[1]);
    if (weight < 0 || height <= 0){
        System.out.println("Error");
        }
    else{
        int numerator = weight;
        double denominator = (height*height)*703;
        double bodyMassIndex = (numerator/denominator);
        System.out.println(bodyMassIndex);
        } */

 /* int a = (int) Math.pow(2, 2);
    System.out.println(a); */

 /* int nbrFriends = args.length;
    int sum = 0;
    int i = 0;
    int totalRatings = nbrFriends;
    while ( i < nbrFriends ) {
        int rating = Integer.parseInt(args[i]);
        if ( rating < 1 || rating > 5 ) {
            totalRatings -= 1;} 
        else {
            sum = sum + rating;}
        i = i + 1;}
    double avg = (sum * 1.0) / totalRatings;
    System.out.println("The game's ratings average is " + avg); */

 /* int first = Integer.parseInt(args[0]);
    int second = Integer.parseInt(args[1]);
    if(first > second){
        int temp = first;
        first = second;
        second = temp;}
    for(int i = 2; i < args.length; i++){
        int num = Integer.parseInt(args[i]);
        if ((num > first) && (num < second)){
            System.out.print(num + " ");}
        }
    System.out.println(); */

 /* int a = 5*3/2;
    System.out.println(a);*/

 /* double a = 5/5.25;
    System.out.println(a); */
 /*int[][] arr2d = 
        { {1,2,3},{4,5,6},{7,8,9} };
    for (int row = arr2d.length-1; row >= 0; row--){
        for (int col = 0; col < arr2d[row].length; col++){
            System.out.print(arr2d[row][col] + " ");
            }
        System.out.println();
        }*/
 /* int[][] arr= {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        };
    //GOAL: find the minimum of each row
        for (int i =0; i<arr.length; i++){ //go through each row
            int min = arr[i][0];
            for (int j = 0; j<arr[i].length; j++){ //go through each colum in row i
                if (arr[i][j]<min){
                    min = arr[i][j];
                }
                System.out.println(min);
            }   
        } */
 /*int[] a = {5, 1, 2, 3, 4, 0};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 2; 
        int minIndex = 3;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                {max = a[i]; 
                maxIndex = i;}
            if (a[i] < min)
                {min = a[i]; 
                minIndex = i;}
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(minIndex);
        System.out.println(maxIndex);*/
        //Move to right
        /*int[] a = {1, 2, 3, 4, 5};
        int temp = a[a.length-1];
        for (int i = a.length-1; i>=1; i--) {
            a[i] = a[i-1];
            }
        a[0] = temp;
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");*/
        //Move to left
        /*int[] a = {1, 2, 3, 4, 5};
        int temp = a[0];
        for (int i = 0; i < a.length-1; i++){
            a[i] = a[i+1];    
        }
        a[a.length-1] = temp;
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");*/
 /*int[] a = {1, 1, 2, 2, 3, 4};
        Arrays.sort(a);
        int i;
        int j = 0;
        for (i = 0; i < a.length ; i++) {
            j = i+1;
            while (j < a.length && a[j] == a[i]){
                a[j] = 0; 
                j++;
            }
            if (j == a.length) 
                break;
            i = j;
        }
        System.out.println(i);
        System.out.println(j);*/
 /*int[] i = {1, 2, 3, 4, 5, 6};
        int[] j = {7, 8, 9, 10, 11, 12};
        for (int n = 3; n <= 5; n++){
            i[n] = j[n];
            System.out.print(i[n]);
        }
        System.out.println();
        for (int n = 0; n < i.length; n++){
            System.out.println(i[n]);
        }*/
 /*int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }*/

 /* int a = Integer.parseInt(args[0]);
        System.out.println(a); */

 /* double work = StdRandom.uniform();
    StdOut.println(work); */
    
 /* int n = Integer.parseInt(args[0]);
        while (n > 0){
            StdOut.println("Enter a number: ");
            int number = StdIn.readInt();
            StdOut.println("The user entered: " + number);
            n--;
        }
        int o = Integer.parseInt(args[0]);
        while (o > 0){
            StdOut.println("Enter a number: ");
            double number1 = Math.random();
            StdOut.println("The user entered: " + number1);
            o--;
       }
        while (n > 0) {
            StdOut.println("Enter a number: ");
            int number = StdIn.readInt();
            StdOut.println("The user entered: " + number);
            n--;
            double number1 = Math.random();
            StdOut.println("The user entered: " + number1);
            n--;
        }*/

        int i = 4;
        powerOfTwo(i);
        System.out.println(i);

    }
}
