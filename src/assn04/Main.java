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
    bst = bst.insert(21);
    bst = bst.insert(12);
    bst = bst.insert(0);
    bst = bst.insert(7);

    bst = bst.remove(3);
    bst = bst.remove(21);
    bst.printBreadthFirstTraversal();

    System.out.println();

    bst.printInOrderTraversal();

    System.out.println();
    System.out.println("Done");
  }

}
