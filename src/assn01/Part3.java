package assn01;

public class Part3
{
    public static void main(String args[])
    {
        short sh;
        sh = Short.MAX_VALUE;
        //sh is 32767, which is stored in MAX_VALUE
        //from the Short class.
        method2();
    }

    public static void method2()
    {
        int n2 = 0xABC;
        System.out.println(n2);
        method3();
    }

    public static void method3()
    {
        int[] a3 = new int[]{'a','z'};
        /*
        *declaring a3 as charArray would
        *prevent the print statement from giving numbers, so
        *a3 is declared as an int array for the ascii
        *numbers to be printed.
         */
        System.out.println(a3[0]+" "+a3[1]);
    }
}
