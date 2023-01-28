/*This class is mean to store all parameters given in each line of input for products.
* It contains a no argument constructor and a constructor for all arguments, along with
* accompanying functions for returning attributes, etc.
*/
package assn02;

public class ProductBatch {
    //private class variables
    private String _date; //date of assembly
    private String _time; //the assembling time in a 24-hour format
    private String _category; //single-word descriptor of the category of item
    private Double _fee; //per unit assembly cost
    private int _quantity; //number of product/product count
    private Double _aTime; //assembly time for this batch of product
    private Double _cost; //total cost for producing this batch of product

    //no-arg constructor
    public ProductBatch(){

    }

    //6-arg constructor
    public ProductBatch(String date, String time, String category,
                        Double fee, int quantity,
                        Double aTime, Double cost){
        _date = date;
        _time = time;
        _category = category;
        _fee = fee;
        _quantity = quantity;
        _aTime = aTime;
        _cost = cost;
    }

    //String[] constructor
    //Assumes a String[] of length 7 is given, with date, time, etc in order starting with
    //date at index 0
    public ProductBatch(String[] batch){
        _date = batch[0];
        _time = batch[1];
        _category = batch[2];
        _fee = Double.valueOf(batch[3]);
        _quantity = Integer.parseInt(batch[4]);
        _aTime = Double.valueOf(batch[5]);
        _cost = Double.valueOf(batch[6]);
    }

    //accessor methods
    public String get_date(){
        return _date;
    }
    public String get_time(){
        return _time;
    }
    public String get_category(){
        return _category;
    }
    public Double get_fee(){
        return _fee;
    }
    public int get_quantity(){
        return _quantity;
    }
    public Double get_aTime(){
        return _aTime;
    }
    public Double get_cost(){
        return _cost;
    }


}
