package selfPractice;

import assn03.LinkedList;

public class Assn03Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        LinkedList list2 = new LinkedList();
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(10);

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
        list.merge(list2);
        System.out.println(list);
        System.out.println(list.getTail().getValue());
    }
}
