public class RecursiveAddition{

    public static int MyAddition(int op1, int op2){
        if (op2 == 0)
            return op1;
        else
            return MyAddition(op1+1, op2-1);
    }

    public static void main(String[] args){
        System.out.println(MyAddition(10,10));    
    }
}