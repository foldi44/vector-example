package hu.webler;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // Create a Vector instance with an initial capacity of 3 and an increment size of 2
        Vector<Integer> numbersList = new Vector<>(3, 3);

        // Add elements to the vector
        numbersList.addElement(1);
        numbersList.addElement(25);
        numbersList.addElement(3);
        numbersList.addElement(7);

        // Obtain an Enumeration to iterate through the vector elements
        Enumeration<Integer> numList = numbersList.elements();

        // Iterate through the vector elements using the Enumeration
        while (numList.hasMoreElements()) {
            System.out.println(numList.nextElement());
        }

        System.out.println(" ");
        // Print the vector's capacity using a helper method
        printCapacity(numbersList);

        // Trim the vector's capacity to its current size
        numbersList.trimToSize();


        System.out.println("After trim");
        printCapacity(numbersList);
        System.out.println(" ");

        // Remove an element at index 3 from the vector
        numbersList.removeElementAt(2);

        // Iterate through the vector after removing an element
        System.out.println("Vector after removing an element:");
        for (int i : numbersList) {
            System.out.println(i);
        }
    }

    // Helper method to print the vector's capacity
    private static void printCapacity(Vector<Integer> numbersList) {
        System.out.print("Vector's capacity: ");
        System.out.println(numbersList.capacity());
    }
}

