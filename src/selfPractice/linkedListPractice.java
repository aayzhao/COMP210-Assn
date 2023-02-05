package selfPractice;

import java.util.LinkedList;

public class linkedListPractice {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Hello");
        ll.add("world");
        ll.add(1, "_");

        System.out.println("Initial LinkedList " + ll);

        // Function call
        ll.remove(1);

        System.out.println("After the Index Removal " + ll);

        ll.remove("Hello");

        System.out.println("After the Object Removal " + ll);

    }

}
