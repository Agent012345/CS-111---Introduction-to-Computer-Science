public class Arrays2D {
    public static void main(String[] args) {
        
        int[][] grades = {
                            {56, 78, 67}, //Exam 1 grades       
                            {79, 92, 83}, //Exam 2 grades
                            {90, 89, 79}, //Exam 3 grades
                            {51, 67, 84} //Exam 4 grades
                        };
        for (int k = 0; k < grades.length; k++){ //going through rows/exams 
            int sum = 0; //Inside for loop to RESET sum and average to 0
            for (int i = 0; i < grades[k].length; i++){ //going through columns/students
                sum = sum + grades[k][i];
            }
            double average = (double) sum / grades[k].length;
            System.out.println("The average of Exam " + (k+1) + " is: " + average);
        }
    }
}