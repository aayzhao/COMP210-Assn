package selfPractice;

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
}
