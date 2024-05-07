import java.util.TreeSet;

public class TreeSet_example {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<>();


        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Kiwi");

        // Print the TreeSet
        System.out.println("TreeSet after adding elements: " + treeSet);

        // Changing an element in the TreeSet
        treeSet.remove("Banana");
        treeSet.add("Mango");
        System.out.println("TreeSet after changing element: " + treeSet);

        // Remove an element from the TreeSet
        treeSet.remove("Grape");
        System.out.println("TreeSet after removing element: " + treeSet);

        System.out.println("Does TreeSet contain 'Orange'? " + treeSet.contains("Orange"));

        // Iterate over the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Get the size of the TreeSet
        System.out.println("Size of the TreeSet: " + treeSet.size());
    }
}
