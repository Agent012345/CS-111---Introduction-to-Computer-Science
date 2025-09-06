import java.util.ArrayList;

public class ListPractice{

    public static void main(String[] args){
        ArrayList <String> fruits = new ArrayList<String>(); //ArrayList is a generic data structure
        fruits.add("apple"); //apple
        fruits.add("orange"); //apple -> orange
        fruits.add("grape"); //apple -> orange -> grape
        fruits.add("blueberry"); //apple -> orange -> grape -> blueberry
        System.out.println(fruits.get(2)); //grape
        fruits.add(3, "strawberry"); //apple -> orange -> grape -> strawberry -> blueberry
        fruits.remove(2);
        for (int i = 0; i < fruits.size(); i++){
            System.out.print(fruits.get(i) + " -> ");
        }
        System.out.println();

        //write a piece of code that goes through fruits and only prints out the fruits with an even number of letters in the name
        for (int i = 0; i < fruits.size(); i++){
            int total = fruits.get(i).length();
            if (total %2 ==0){
                System.out.println(fruits.get(i));
            }
        }
    }
}