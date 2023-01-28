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

        printList(prodList);

    }

    //void method to print out the list of product batches. Testing purposes
    public static void printList(ProductBatch[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println("Date: " + list[i].get_date());
            System.out.println("Time: " + list[i].get_time());
            System.out.println("Category: " + list[i].get_category());
            System.out.println("Fee: " + list[i].get_fee());
            System.out.println("Quantity: " + list[i].get_quantity());
            System.out.println("Assembly Time: " + list[i].get_aTime());
            System.out.println("Cost: " + list[i].get_aTime()+ "\n");
        }
    }

}
