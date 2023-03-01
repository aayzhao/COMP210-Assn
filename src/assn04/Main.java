package assn04;

public class Main { public static void main(String[] args) {
    BST<Integer> bst = new NonEmptyBST<>(3);
    bst = bst.insert(8);
    bst = bst.insert(1);
    bst = bst.insert(9);
    bst = bst.insert(4);
    bst = bst.insert(2);
    bst = bst.insert(5);
    bst = bst.insert(6);

    //bst = bst.remove(3);
    bst.printBreadthFirstTraversal();

    System.out.println("Done");
  }

}
