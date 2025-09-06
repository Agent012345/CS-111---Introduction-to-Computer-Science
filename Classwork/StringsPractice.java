public class StringsPractice{

    public static String addSOS(String str){
        //find out if the parameter has an s
        //str.indexOf("s") --> -1
        if (str.indexOf("s") != -1){
            return str + "sos";
        }
        else
            return str;
    }
    //write a function reverse that takes in a String parameter
    //and returns the reverse of String parameter
    //reverse("apple") -> ("elppa")
    public static boolean isPalindrome (String str){
        String rev = reverse(str);
        boolean b = str.equals(rev);
        return b;
    }
    
    public static String reverse(String str){
        //charAt()
        //concatenation -> +
        //start at end of our string and go to the beginning
        //add on each letter to a blank string
        String rev = "";
        for (int i = str.length() -1; i >= 0; i--){
            rev = rev + str.charAt(i);
            //
            //e
            //el
            //elp
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(reverse("level"));
        System.out.println(isPalindrome("level"));
    }
}