package assn02;

import java.util.Scanner;

public class JavaWarmUp {
    //main method
    public static void main(String args[]){
        int itemCount;

        //creating  new scanner object
        Scanner scan = new Scanner(System.in);

        //query for batch numbers
        itemCount = Integer.parseInt(scan.nextLine());

        //create array and allocate memory to store ProductBatch objects
        ProductBatch[] prodList = new ProductBatch[itemCount];

        //query for and add ProductBatch to array
        for(int i = 0; i < itemCount; i++){
            prodList[i] = new ProductBatch(scan.nextLine().split(" "));
        }

        printList(prodList);
        System.out.println();
        printHighest(prodList);
        printLowest(prodList);

    }


    //helper methods
    //find/calculate statistics based on given list

    //finds index of the ProductBatch with the highest price/fee
    public static int getMaxPriceIndex(ProductBatch[] list) {
        int index = list.length - 1;
        for (int i = list.length - 2; i >= 0; i--) {
            if (list[index].get_fee() < list[i].get_fee()) {
                index = i;
            }
        }
        return index;
    }

    //finds index of the ProductBatch with the lowest price/fee
    public static int getMinPriceIndex(ProductBatch[] list) {
        int index = list.length - 1;
        for (int i = list.length - 2; i >= 0; i--) {
            if (list[index].get_fee() > list[i].get_fee()) {
                index = i;
            }
        }
        return index;
    }


    //void printing methods

    //void method for printing the highest assembly fee (that comes latest in the list)
    public static void printHighest(ProductBatch[] list){
        int index = getMaxPriceIndex(list);
        System.out.println("Highest per unit assembling fee:");
        System.out.println(" When: " + list[index].get_date() + " " + list[index].get_time());
        System.out.println(" Category: " + list[index].get_category());
        System.out.println(" Price: " + list[index].get_fee());
    }

    //void method for printing the lowest assembly fee (that comes latest in the list)
    public static void printLowest(ProductBatch[] list){
        int index = getMinPriceIndex(list);
        System.out.println("Lowest per unit assembling fee:");
        System.out.println(" When: " + list[index].get_date() + " " + list[index].get_time());
        System.out.println(" Category: " + list[index].get_category());
        System.out.println(" Price: " + list[index].get_fee());
    }

    //void method to print out the list of product batches. Testing purposes
    public static void printList(ProductBatch[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println("Index: " + i);
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
