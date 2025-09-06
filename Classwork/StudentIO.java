public class StudentIO{
    
    public static void main(String[] args) {
        
        //goal: print out all students' information
        //_name_ is majoring in _major_ and has a GPA of _gpa_
        int numOfStudents = StdIn.readInt();
        for (int i = 0; i < numOfStudents; i++){
            String name = StdIn.readString(); //read name
            String major = StdIn.readString(); //read major
            double gpa = StdIn.readDouble();//read gpa
            StdOut.println(name + " is majoring in " + major + " and has a GPA of: " + gpa);
        }
        
    }
}