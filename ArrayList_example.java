//using array we have defined array size and this size cannot change
//But using ArrayList we do not have to define any type of size of array
//it is also called resizeable  array
//it's  provide many methods like add, access, change, remove element

import java.util.ArrayList;
public class ArrayList_example {
    public static void main(String[] args) {
        ArrayList<String> java = new ArrayList<>();

        java.add("A");
        java.add("B");
        java.add("C");

        System.out.println(java);  // [A,B,C]

        for (String element : java) {        //this print as  //A
            System.out.println(element);                      //B
        }                                                     //C

        //access the element form arraylist ...1 is B in arraylist
        String a =  java.get(1);
        System.out.println(a);  //B

        //change the 2nd position with D , place of C
        java.set(2,"D");
        System.out.println(java);   //[A,B,D]

        //remove the 0th element ,A that removed from arraylist
        String b =  java.remove(0);
        System.out.println(java);     /* [B,D] */

    }
}
