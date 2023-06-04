
package Dsa;

import java.sql.SQLOutput;
import java.util.HashSet;



public class HashSetExample {
    public static void main(String[] args) {
        //create a hashset to store integer
        HashSet<Integer> numbersSet=new HashSet<>();

        //add elments to HashSet
        numbersSet.add(10);
        numbersSet.add(5);
        numbersSet.add(5); //Duplicate elements will be ignored
        numbersSet.add(3);

        System.out.println("hashet" + numbersSet);


        //check if a number exits
        int numbersToCheck=5;
        boolean containsnumber =numbersSet.contains(numbersToCheck);
        System.out.println("hashset contains" + numbersToCheck +":" + containsnumber);

        //remove an element from the hashset
        int numberToRemove =3;
        boolean removed = numbersSet.remove(numberToRemove);
        System.out.println("removed"+ numberToRemove + ":" + removed);

        System.out.println("hashset after rremoval" +numbersSet);

        //iterate over the elements of the Hashset
        System.out.println("iterating oveer the hashset");
        for (int number : numbersSet) {
            System.out.println(number);
        }

        // Clear the hashset
        numbersSet.clear();
        System.out.println("Hashset after cleaning" + numbersSet );




    }
}
