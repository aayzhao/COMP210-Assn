package selfPractice;
import assn04.BST;
import assn04.NonEmptyBST;
import assn04.EmptyBST;

import static java.lang.Integer.valueOf;

/**
 * main method for running anything.
 *
 * @author Aaron Zhao
 * @version N/A
 */
public class Main {
    static int _num;
    public static void main(String[] args){
        Main y = new Main(5);
        System.out.println(y.getNum());

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        Integer x = 10;
        Integer z = 10;
        System.out.println(x == z);

    }

    public Main(int num){
        this.setNum(num);
    }
    public int getNum(){
        return _num;
    }

    public void setNum(int num){
        _num = num;
    }

    public BST<Integer> example(int x) {
        BST<Integer> tree;
        if (x != 0) {
            tree = new NonEmptyBST<>(x);
            return tree;
        }
        tree = new EmptyBST<>();
        return tree;
    }
}
