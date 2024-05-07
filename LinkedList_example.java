/*
Java LinkedList class uses a doubly linked list to store the elements.
 It provides a linked-list data structure
each element is called node in linked list
it's having three filed :-
prev--store the address of previous element
next--store the address of next element
data-- actual data
it's  provide many methods like add, access, change, remove element
*/

import java.util.LinkedList;
public class LinkedList_example {

    public static void main(String[] args) {

        LinkedList<String> java = new LinkedList<>();
        java.add("prince");
        java.add("param");
        java.add("purv");

        System.out.println(java);  //[prince,param,purv]

        String a = java.get(1);
        System.out.println(a); //param

        String b = java.set(2,"prit");
        System.out.println(java);  //[prince,param,prit]

        String c = java.remove(2);
        System.out.println(java); //[prince,param]

    }
}
