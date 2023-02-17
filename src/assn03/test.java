package assn03;
//DELETE BEFORE SUBMISSION
public class test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        //list2.add(3);

        System.out.println(list);
        System.out.println(list2 + "\n");

        //list.removeAtIndex(3);

        //System.out.println(list);

        System.out.println(list.isEqual(list2));
    }
}
