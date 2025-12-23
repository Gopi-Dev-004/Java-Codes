package java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unmodifiable_Collections_with_copyOf {
// this can be used with list, set and map

    public static void main(String[] args) {

       uml();
       copyOf();
    }
    public static void uml() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        // Create unmodifiable VIEW (not a new list)
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        System.out.println("Before change: " + unmodifiableList);

        list.add("C++");  // changing original list
        System.out.println("After change: " + unmodifiableList); // reflects change
    } // it reflected
    public static void copyOf() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        // Create a true copy (new list)
        List<String> copyList = List.copyOf(list);

        System.out.println("Before change: " + copyList);

        list.add("C++"); // change original
        System.out.println("After change: " + copyList); // does NOT change
    }// dose not reflect
}
