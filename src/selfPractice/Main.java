package selfPractice;

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
