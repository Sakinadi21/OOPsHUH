package ArrayList;

import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class arrayList { // Class name following Java naming conventions
    public static void main(String[] args) {
        // Create a new ArrayList to hold Integer values
        ArrayList<Integer> arr = new ArrayList<>();

        // Add elements to the ArrayList
        arr.add(1); // Add 1 to the list
        arr.add(2); // Add 2 to the list
        arr.add(3); // Add 3 to the list
        arr.add(9); // Add 9 to the list
        arr.add(5); // Add 5 to the list
        arr.add(7); // Add 7 to the list

        // Print the size of the ArrayList
        System.out.println(arr.size()); // Use the size() method on the arr object

        // Print the elements of the ArrayList
        System.out.println(arr); // This will print the ArrayList in its default string representation
    }
}
