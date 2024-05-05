package project_1;

// This class is to hold the orders data using ArrayList & enum of order Status

public class Order{

    //--------------< the enum of the Order Status >--------------
     public static enum OrderStatus {
        NEW, PENDING, REFUSED, COMPLETE
    }

    //--------------< The data members for the order data >--------------
    private String Id;
    private String Title;
    private String Model;
    private double Weight;
    private double Price;
    private String Status;

    //--------------< This is the Constructor >--------------
    public Order(String id, String title, String model, double weight, double price, String stat) {
        this.Id = id;
        this.Title = title;
        this.Model = model;
        this.Weight = weight;
        this.Price = price;
        this.Status = stat;
    }

    //--------------< The setters and getters methods >--------------
    //This method is to set ID of the order
    public void setId(String id){
        this.Id =id;
    }
    //This method is to get ID of the order
    public String getId(){
    return Id;
    }
    //This method is to set Title of the order
    public void setTitle(String title){
        this.Title= title;
    }
    //This method is to get the Title of the order
    public String getTitle(){
        return Title;
    }
    //This method is to set Model of the order
    public void setModel(String model){
        this.Model= model;
    }
    //This method is to get the Model of the order
    public String getModel(){
        return Model;
    }
    //This method is to set the Weight of the order
    public void setWeight(Double weight){
        this.Weight= weight;
    }
    //This method is to get the Weight of the order
    public double getWeight(){
        return Weight;
    }
    //This method is to set Price of order
    public void setPrice(Double price){
        this.Price= price;
    }
    //This method is to get the Price of the order
    public double getPrice(){
        return Price;
    }
    //This method is to set the status of the order
    public void setStatus(String status) {
        this.Status=status;
    }
    //This method is to get the status of the order
    public String getStatus() {
        return Status;
    }
    

     // --------------< This is toString method >--------------
    public String toString() {
        return("ID: " + Id + ", Title: " + Title + ", Model: " + Model + ", Weight: " + Weight + ", Price: " + Price + ", Status: " + Status);
    }

}