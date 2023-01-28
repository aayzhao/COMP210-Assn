package assn02;

import java.util.Scanner;

public class JavaWarmUp {
    //main method
    public static void main(String args[]){
        int itemCount;


        //creating  new scanner object
        Scanner scan = new Scanner(System.in);

        //query for batch numbers
        System.out.println("Enter entry count:");
        itemCount = scan.nextInt();

        //create array to store ProductBatch objects
        ProductBatch[] prodList = new ProductBatch[itemCount];

        //query for and add ProductBatch to array
        for(int i = 0; i < itemCount; i++){
            System.out.println("Enter ProductBatch Batch #" + (i + 1));
            prodList[i] = new ProductBatch(scan.nextLine().split(" "));
        }

    }


}
