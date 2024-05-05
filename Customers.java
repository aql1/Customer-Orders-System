package project_1;
import java.util.ArrayList;

 /* This class have custumer's data member and setters & Getters methods and ArrayList of order
    it has addOrder method to add an order in an arraList for certain existing customer
 */

 public class Customers {

    //--------------< The data members for the customers data >--------------
    private String ID;
    private String Name;
    private String Address;
    private String DOB;
    private String Mobilephone;
    private String Email;

    //--------------< The ArrayList of the orders >--------------
    static ArrayList<Order> orders = new ArrayList<>();
   
    // -------------< This object of type company >--------------
    static Company company = new Company();
    
    
    //--------------< This is the Constructor >--------------
    public Customers(String id, String name, String address, String dob, String phone, String email) {
        this.ID = id;
        this.Name = name;
        this.Address = address;
        this.DOB = dob;
        this.Mobilephone = phone;
        this.Email = email;  
    }

    //--------------< The setters and getters methods >--------------
    //This method is to set ID of the customer
    public void setID(String id){
        this.ID =id;
    }
    //This method is to get ID of the customer
    public String getID(){
    return ID;
    }
    //This method is to set Name of the customer
    public void setName(String name){
        this.Name= name;
    }
    //This method is to get the Name of the customer
    public String getName(){
        return Name;
    }
    //This method is to set address of the customer
    public void setAddress(String address){
        this.Address= address;
    }
    //This method is to get the address of the customer
    public String getAddress(){
        return Address;
    }
    //This method is to set date of birth of the customer
    public void setDOB(String DOB){
        this.DOB =DOB;
    }
    //This method is to get date of birth of the customer
    public String getDOB(){
        return DOB;
    }
    //This method is to set MobilePhone of the customer
    public void setMobilephone(String mobilephone){
        this.Mobilephone= mobilephone;
    }
    //This method is to get the MibilePhone of the customer
    public String getMibilePhone(){
        return Mobilephone;
    }
    //This method is to set Email of the customer
    public void setEmail(String email){
        this.Email= email;
    }
    //This method is to get the Email of the customer
    public String getEmail(){
        return Email;
    }
    //This method is to get the ArrayList of the orders
    public ArrayList<Order> getOrders() {
        return orders;
    }

    
    //--------------< This method is used to add order >--------------
    public static void addOrder(Order ord){
        // adding the order to the arraylist of orders
        orders.add(ord);
        System.out.println("\n---------< Order added successfully! >---------\n");
    } 

    // --------------< This is toString method >--------------
    public String toString() {
        return (ID + "\t" + Name + "\t" + Address + "\t" + DOB + "\t" + Mobilephone + "\t" + Email);
    }

}