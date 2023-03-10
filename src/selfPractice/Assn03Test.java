package selfPractice;

import assn03.LinkedList;
import assn03.Node;
import assn03.NodeImpl;

public class Assn03Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(10);

        LinkedList list2 = new LinkedList();
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);

        /*
        System.out.println(list);
        //System.out.println(list2 + "\n");

        list.removeAtIndex(2);

        System.out.println(list);
        System.out.println(list.getHead().getValue());
        System.out.println(list.getTail().getValue());

        //System.out.println(list.isEqual(list2));

        list.removeRepeats();
        System.out.println(list);
        System.out.println(list.getHead().getValue());
        System.out.println(list.getTail().getValue());



        System.out.println(list2);
        list2.reverse();
        System.out.println(list2);
        */

        list2.removeRepeats();
        System.out.println(list2);
        list.merge(list2);
        NodeImpl<Integer> newNode = new NodeImpl<>(6,null); // see what pointer looks like
        list.add(newNode);
        System.out.println(list);

    }
}
