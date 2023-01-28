package assn02;

import java.util.Scanner;
import java.util.HashSet;

public class JavaWarmUp {
    //main method
    public static void main(String args[]){
        //create new var for number of items
        int itemCount;

        //create hash set to store categories
        HashSet<String> uniqueCategories = new HashSet<String>();

        //creating  new scanner object
        Scanner scan = new Scanner(System.in);

        //query for batch numbers
        itemCount = Integer.parseInt(scan.nextLine());

        //create array and allocate memory to store ProductBatch objects
        ProductBatch[] prodList = new ProductBatch[itemCount];

        //query for and add ProductBatch to array
        //add unique product categories to hashset
        for(int i = 0; i < itemCount; i++){
            prodList[i] = new ProductBatch(scan.nextLine().split(" "));
            uniqueCategories.add(prodList[i].get_category());
        }

        //Print out summary statistics and data for categories
        printHighest(prodList);
        printLowest(prodList);
        for(String category : uniqueCategories){
            printStats(category, prodList);
        }

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

    //calculates total quantity of a category produced
    public static int calcTotalQuantity(String cat, ProductBatch[] list){
        int total = 0;
        for(ProductBatch product : list){
            if(cat.equals(product.get_category())) total = total + product.get_quantity();
        }
        return total;
    }

    //calculates weighted average assembling fee and returns a double (not rounded or truncated)
    //for a certain category of product
    public static double calcAvgFee(String cat, ProductBatch[] list){
        double avg = 0;
        int total = 0;
        for(ProductBatch product : list){
            if(cat.equals(product.get_category())){
                total = total + product.get_quantity();
                avg = avg + product.get_fee()* product.get_quantity();
            }
        }
        return avg/(double)total;
    }

    //calculates the weighted average net profit for a given category of profit
    //returns a double (not rounded or truncated)
    public static double calcNetProfit(String cat, ProductBatch[] list){
        double avg = 0;
        int totalUnits = 0;
        double totalTime = 0;
        int batchCost = 0;
        for(ProductBatch product : list){
            if(cat.equals(product.get_category())){
                totalUnits = totalUnits + product.get_quantity();
                totalTime = totalTime + product.get_aTime();
                batchCost = batchCost + product.get_cost();
                avg = avg + product.get_fee()*product.get_quantity();
            }
        }
        return (avg - 16.0*totalTime - (double)batchCost)/(double)totalUnits;
    }


    //void printing methods
    //print out things to console

    //void method for printing the highest assembly fee (that comes latest in the list)
    public static void printHighest(ProductBatch[] list){
        int index = getMaxPriceIndex(list);
        System.out.println("Highest per unit assembling fee:");
        System.out.println("    When: " + list[index].get_date() + " " + list[index].get_time());
        System.out.println("    Category: " + list[index].get_category());
        System.out.println("    Price: " + list[index].get_fee());
    }

    //void method for printing the lowest assembly fee (that comes latest in the list)
    public static void printLowest(ProductBatch[] list){
        int index = getMinPriceIndex(list);
        System.out.println("Lowest per unit assembling fee:");
        System.out.println("    When: " + list[index].get_date() + " " + list[index].get_time());
        System.out.println("    Category: " + list[index].get_category());
        System.out.println("    Price: " + list[index].get_fee());
    }

    //void method for printing the summary statistics for producing a given category of product
    public static void printStats(String cat, ProductBatch[] list){
        System.out.println("Statistic of " + cat);
        System.out.println("    Quantity: " + calcTotalQuantity(cat, list));
        System.out.println("    Average Assembling Fee: " + Math.round(calcAvgFee(cat, list)*100.0)/100.0);
        System.out.println("    Average Net Profit: " + Math.round(calcNetProfit(cat, list)*100.0)/100.0);
    }

    //void method to print out the list of product batches. Testing purposes only
    //not used for assn02
    public static void printList(ProductBatch[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println("Index: " + i);
            System.out.println("Date: " + list[i].get_date());
            System.out.println("Time: " + list[i].get_time());
            System.out.println("Category: " + list[i].get_category());
            System.out.println("Fee: " + list[i].get_fee());
            System.out.println("Quantity: " + list[i].get_quantity());
            System.out.println("Assembly Time: " + list[i].get_aTime());
            System.out.println("Cost: " + list[i].get_cost()+ "\n");
        }
    }

}
