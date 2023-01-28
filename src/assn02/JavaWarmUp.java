package assn02;

import java.util.Scanner;

public class JavaWarmUp {
    //main method
    public static void main(String args[]){
        int itemCount;


        //creating  new scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter entry count:");
        itemCount = scan.nextInt();

        for(int i = 0; i < itemCount; i++){
            System.out.println("Enter ProductBatch Batch #" + (i + 1));
        }

    }


}
