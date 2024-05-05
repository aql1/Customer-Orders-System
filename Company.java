package project_1;
import java.util.ArrayList;
import java.util.Scanner;
import project_1.Order.OrderStatus;


public class Company {

    //--------------< The ArrayList of the customers >--------------
    static ArrayList<Customers> customers = new ArrayList<>(); 

    //--------------< The Customers class object >--------------
    static Customers customer = new Customers(null, null, null, null, null, null);


    //--------------< this method have an initial fixed collection of customers >--------------
    private static void initialCustomers() {
        // Initial fixed collection of customers
        customers.add(new Customers("1234567890", "Abdullah", "Makkah","28/2/2004", "0545650318", "Abdullah-alaql@hotmail.com"));
        customers.add(new Customers("0987654321", "Abdulrahamn", "Makkah","23/7/2001", "0501268566", "abdulrhamnbumonther@gmail.com"));
        customers.add(new Customers("1029384756", "Mohammed", "Makkah","8/9/1980", "0567984325", "Ahmmed.M@hotmail.com"));
    }

    //--------------< This method is used to add a customers >--------------
    private static void addCustomer(Customers customer) {   
        // adding The customer's information to the ArrayList of the customers
        customers.add(customer);
        System.out.println("\n---------< Customer added successfully! >---------\n");
    }

    // --------------< This method checks if the given id customer is in the list >--------------
    private static Customers findCustomer(String id){
        // for loop to search in the arraylist of customer if the id is already exist
        for (Customers customer : customers) {
            if (customer.getID().equals(id) || id.contains(customer.getID()) ) {
                return customer;
            }
        }
        return null;
    }

    //--------------< This method is used to print all customers >--------------
    private static void printCustomers() {
        //The Head of the tabul form
        System.out.println("______________________________________________________________________________________________________________________________");
        System.out.printf("| %-10s |  %-15s |  %-15s |  %-14s |  %-14s |  %-35s| \n","ID","Name","Address","Date of birth","Mobile","Email");
            System.out.println("______________________________________________________________________________________________________________________________");
            //for loop to print all the customers Information
            for (Customers custumer  : customers) {
                System.out.printf("| %-10s |  %-15s |  %-15s |  %-14s |  %-14s |  %-35s| \n",custumer.getID(),custumer.getName(),custumer.getAddress(),custumer.getDOB(),custumer.getMibilePhone(),custumer.getEmail());
            }
            System.out.println("______________________________________________________________________________________________________________________________");
    }

    //--------------< This method is used to display specific Customer by the given id  >--------------
    private static void displayCustomer(String id) {
        //The Head of the tabul form
        System.out.println("______________________________________________________________________________________________________________________________");
        System.out.printf("| %-10s |  %-15s |  %-15s |  %-14s |  %-14s |  %-35s \n","ID","Name","Address","Date of birth","Mobile","Email");
        System.out.println("______________________________________________________________________________________________________________________________");
        // geting the customer information from findCustomer method
        System.out.printf("| %-10s |  %-15s |  %-15s |  %-14s |  %-14s |  %-35s \n",findCustomer(id).getID(),findCustomer(id).getName(),
        findCustomer(id).getAddress(),findCustomer(id).getDOB(),findCustomer(id).getMibilePhone(),findCustomer(id).getEmail());

        //The Head of the tabul form for the  customer's order
        System.out.println("______________________________________________________________________________________________________________________________\n\n");
        System.out.println("Customer's orrder/s:\n");
        System.out.printf("|  %-20s |  %-10s |  %-15s |  %-14s |  %-8s |  %-10s  \n",
        "Order ID", "Title", "Model","Weight","Price","Status");
        System.out.println("________________________________________________________________________________________________");

         //for loop to print customer's order
        for (Order order : customer.getOrders()) {
            if (order.getId().contains(id)) {
            System.out.printf("|  %-20s |  %-10s |  %-15s |  %-14s |  %-8s |  %-10s  \n",
            order.getId(),order.getTitle(), order.getModel(),order.getWeight(), order.getPrice() , order.getStatus());
            System.out.println("________________________________________________________________________________________________");
        }
    }
    
}

    //--------------< This method is used to print all Orders >--------------
    public static void printOrders() {

        //The Head of the tabul form
        System.out.println("______________________________________________________________________________________________________________________");
        System.out.printf("| %-11s |  %-15s | %-17s |  %-14s |  %-8s |  %-8s | %-8s | %-8s  \n","Customer ID",
        " Customer Name","order ID","Order Title","Model","Weight","Price","Status");
        System.out.println("______________________________________________________________________________________________________________________");

        // foor loop to get the ID and name of the customer
        for (Customers customer : customers) {
            //for loop to print all the orders Information
            for (Order order : customer.getOrders()) {
                if ((order.getId().contains(customer.getID()))){
                    System.out.printf("| %-11s |  %-15s |  %-17s|  %-14s |  %-8s |  %-8s | %-8s | %-8s \n",
                    customer.getID(), customer.getName(), order.getId(), order.getTitle(), order.getModel(),
                    order.getWeight(), order.getPrice(), order.getStatus());
                }
            }
        }
    
    System.out.println("______________________________________________________________________________________________________________________");
    }

    //--------------< this method is used to display specific order by the given id >--------------
    private static void displayOrder(String id){

        // boolean valuable to check if the ID is in the list
        boolean orderFound = false;
        //The Head of the tabul form
        System.out.printf("| %-11s |  %-15s |  %-17s|  %-14s |  %-8s |  %-8s | %-8s | %-8s \n",
        "Customer ID", " Customer Name","order ID", "Order Title", "Model","Weight","Price","Status");
        System.out.println("____________________________________________________________________________________________________________________");

         //for loop to print specific order by the given id 
        for (Customers customer : customers) {
            String ord=customer.getID()+"-"+id;
            //for loop to print customer's id and name
            for (Order order : customer.getOrders()) {
                if ((order.getId().contains(id))) {
                    if(ord.equals(order.getId())){
                        orderFound = true;
                        System.out.printf("| %-11s |  %-15s |  %-17s|  %-14s |  %-8s |  %-8s | %-8s | %-8s \n",
                        customer.getID(), customer.getName(), order.getId(), order.getTitle(), order.getModel(),
                        order.getWeight(), order.getPrice(), order.getStatus());
                    }
                }   
            }
        }
        
        if (!orderFound) {
            System.out.println("Order with id " + id + " not found");
        }
        System.out.println("____________________________________________________________________________________________________________________");
    }

    //--------------< this method is used to print customer's bill >--------------
    private static void bill(String id){
        displayCustomer(id);
        double total=0.0;
        for (Order order : customer.getOrders()) {
            if(order.getId().contains(id)){
                total += order.getPrice();
            }
        }
        System.out.println("\nthe total = "+ total);


    }

    // --------------< This method checks if the given ID is valid >--------------
    private static boolean checkValidId (String id) {  
        // check if the ID has 10 digit of numbers 
        if (id.length()==10 && id.matches("[0-9]{10}")){   
            return true;    
        }
        
        else{
            System.out.println("Error: ID must be 10 digits long & must be a number.");
            return false;
        }   
    }

    // --------------< This method is to set the date and checks if the given date is valid >--------------
    private static boolean setDate(int d, int m, int y) {
        // check if the day is between 1 and 31 and the month is between 1 and 12 and the year between 1920, and 2023
        if((d<=31 && d>=1 ) && (m<=12 && m>=1) && (y>=1920 && y<=2023)){
            return true;
        }
        else{
            System.out.println("\nnot valid date\n");
            return false;
        }      
    }
    
    // --------------< This method checks if the given Mobile Phone is valid >--------------
    private static boolean validMobilephone(String Phone){
        // check if the number is 10 digit, and if it is 13 digit it should contain +966, and if it is 14 digit, it should contain 00966
        if (Phone.length()==10){
            boolean result1= Phone.contains("05");
            if(result1){
                return true;
            }
            else{
                System.out.println("Not valied phone number ,try again");
                return false;
            }
        }
        else if (Phone.length()==13) {
            boolean result2= Phone.contains("+9665");
            if(result2){
                return true;
            }
            else{
                System.out.println("Not valied phone number ,try again");
                return false;
            }        
        }
        else if(Phone.length()==14){
            Boolean result3= Phone.contains("009665"); 
            if(result3){
                return true;
            }
            else{
                System.out.println("Not valied phone number ,try again");
                return false;
            }        
        }
        else{
            System.out.println("Not valied phone number ,try again");
            return false;
        } 

        

}

    // --------------< This method checks if the given email is valid >--------------
    private static boolean validEmail(String email){
        // The email should contain one of the following to be valid email
        String str1 = "@uqu.edu.sa";
        String str2 = "@st.uqu.edu.sa";
        String str3 = "@gmail.com";
        String str4 = "@hotmail.com";
        String str5 = "@outlook.sa";
        String str6 = "@yahoo.com";
        boolean result1= email.contains(str1);
        boolean result2= email.contains(str2);
        boolean result3= email.contains(str3);
        boolean result4= email.contains(str4);
        boolean result5= email.contains(str5);
        boolean result6= email.contains(str6);

        if(result1 || result2 ||result3 ||result4||result5||result6) {
            return true;
        }
        else{ 
            System.out.println("Not valied email ,try again");  
            return false;
        }
    }

    // --------------< This method checks if the given status is valid >--------------
    private static <orderstatus extends Enum<orderstatus>> boolean isValidEnumValue(String status, Class<orderstatus> enumClass) {
        //we call the Enum class to compare the input with the OrderStatus values
        for (orderstatus stat : enumClass.getEnumConstants()) {
        if (stat.name().equalsIgnoreCase(status)) {
            return true;
        }
        }
        return false;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        initialCustomers();

        System.out.println("\n\t---welcom to our company---");
        /*printing a selection screen where the operator 
        can choose the operation the user wants to perform.*/
        do{
            System.out.println("\n\t1- Add a customer");
            System.out.println("\t2- Add a new order to an existing customer");
            System.out.println("\t3- Print all customers information");
            System.out.println("\t4- Print all orders information");
            System.out.println("\t5- Display a customer personal data");
            System.out.println("\t6- Display an order data");
            System.out.println("\t7- Print a customer's bill");
            System.out.println("\t8- Exit the program\n");
            
            System.out.print("please choose the operation you wants to perform: ");
            String c = input.nextLine();
            choice = Integer.parseInt(c);

            // boolean Variable to check the return of the checking methods
            boolean I;

            switch (choice) {
                //case 1 is for add a customer (by providing all her/his information)
                case 1:

                    String id;
                    do{
                        do{
                            // Asking the user to enter ID and check the valid of it from the method checkValidId
                            System.out.print("ID: ");
                            id = input.nextLine();
                            I=checkValidId (id);
                        }while (!I);

                        //check if the id exist in the array list of customer
                        customer = findCustomer(id);
                        if (customer != null) {
                            System.out.println("customer is already exist!");  
                        }
                        else{
                            customer = null;
                        }
                    }while(customer != null);

                    
                    // Asking the user to enter his name
                    System.out.print("Name: ");
                    String name = input.nextLine();

                    // Asking the user to enter his address
                    System.out.print("Address: ");
                    String address = input.nextLine();

                    // Asking the user to enter his date of birth and check the valid of it from the method setDate
                    int day;
                    int month;
                    int year;
                    do{
                        System.out.println("Date of birth:\n");
                        System.out.print("enter the day:");
                        String d = input.nextLine();
                        day = Integer.parseInt(d);
                        System.out.print("enter the month:");
                        String m = input.nextLine();
                        month = Integer.parseInt(m);
                        System.out.print("enter the year:");
                        String y = input.nextLine();
                        year = Integer.parseInt(y);
                        I=setDate(day,month,year);
                    }while(!I);
                    String dob = day+"/"+month+"/"+year;
                
                    // Asking the user to enter his mobile phone number and check the valid of it from the method validMobilephone
                    String phone;
                    do{
                        System.out.print("Mobile phone number(saudi number): ");
                        phone = input.nextLine();
                        I = validMobilephone(phone);
                    }while (!I);
                    
                    //Asking the user to enter his email and check the valid of it from the method validEmail
                    String email;
                    do{
                        System.out.print("Email: ");
                        email = input.nextLine();
                        I=validEmail(email);
                    }while(!I);

                    // adding the inputs to an object to pass the object to the addcustomer method To add the customer to the arraylist of customers
                    Customers addcustomer = new Customers(id, name, address, dob, phone, email);
                    addCustomer(addcustomer);
                    break;

                 // case 2 is for add a NEW order to a certain existing customer
                case 2:
                    // Asking the user to enter customer ID and check the valid of it from the method checkValidId 
                    String customerid;
                    do{
                        do{
                            System.out.print("Customer ID: ");
                            customerid = input.nextLine();
                            I=checkValidId(customerid);
                        }while (!I);
                    
                        //check if the id exist in the array list of customer
                        Customers customer = findCustomer(customerid);
                        if (customer == null) {
                            System.out.println("Customer ID not found.");
                            I=false;
                        }
                        else{
                            customerid=customer.getID();
                            I=true;
                        }
                    }while (!I);

                    // Asking the user to enter order ID and check the valid of it
                    String ido;
                    System.out.print("Enter order ID: ");
                    ido= input.nextLine();
                    String orderid = customerid+"-"+ido;

                    // asking user to enter title of order
                    System.out.print("Enter the Title: ");
                    String title=input.nextLine();

                    // asking user to Eneter the Model of order 
                    System.out.print("Enter the Model of order: ");
                    String model= input.nextLine();

                    //asking user to Enter the Weight of order And check if the weight is valid
                    Double weight;
                    do{
                        System.out.print("Enter the weight of order: ");
                        String w=input.nextLine();
                        weight = Double.parseDouble(w);
                        if (weight>0){
                            I= true;
                        }
                        else{
                            System.out.println("Error: inverted weigh");
                            I= false;
                        }
                    }while(!I);
                    
                    //asking user to Enter the price of order And check if the price is valid
                    Double price;
                    do{
                        System.out.print("Enter the Price of order: ");
                        String p=input.nextLine();
                        price = Double.parseDouble(p);
                        if (price>0){
                            I= true;
                        }
                        else{
                            System.out.println("Error: inverted price");
                            I= false;
                        }
                    }while(!I);  
                    

                    //asking user to Enter the status of order And check if the stat is valid                    
                    String stat;
                    do{
                        System.out.print("Enter this status (NEW, PENDING, REFUSED or COMPLETE): ");
                        stat = input.nextLine();
                        if (isValidEnumValue(stat, OrderStatus.class)) {
                            I= true;
                        } else {
                            System.out.println("The input is not a valid order status.");
                            I= false;
                        }                   
                    }while(!I);

                    // adding the inputs to an object to pass the object to the addOrder method To add the order to the arraylist of orders
                    Order order = new Order(orderid, title, model, weight, price, stat.toUpperCase());
                    Customers.addOrder(order);
                    break;

                // case 3 is for Print all customers information, without his/her orders data (in a well-tabular form)
                case 3:
                    // calling the method printCustomers to print all customer's data from the arraylist of customers
                    System.out.println("\n");
                    printCustomers();
                    break;

                /* case 4 is for Print all orders information (in a well-tabular form) including ID and name of 
                the corresponding customer for each order
                 */
                case 4:
                     // calling the method printOrders to print all orders data from the arraylist of order
                    printOrders();
                    break;

                /* case 5 is for Display specific customer personal data including his/her orders data (by reading
                the customer ID from the operator)
                */             
                case 5:
                    do{
                        System.out.print("Enter customer ID: ");
                        String idc = input.nextLine();
                        // Check if the entered ID is 10 digits long
                        I = checkValidId(idc) ;
                        if (I) {
                            // check if the ID of the customer is in the arraylist
                            Customers a = findCustomer(idc);
                            if (a == null) {
                                System.out.println(" ID not found.");
                                I = false;
                            } else {
                                displayCustomer(idc);
                            }
                        } else {
                            I = false;
                        }
                    }while(!I);
                    break;

                /* case 6  is for Display specific order data including ID and name of the corresponding customer
                (by reading order ID from the operator)*/
                case 6:
                        // Asking the user to enter the id of order and use displayOrder method to display order data 
                        String idO;                    
                        System.out.print("Enter order ID: ");
                        idO= input.nextLine();
                        displayOrder(idO);                                   
                    break;

                /* case 7 is for Print a specific customer’s bill (in a well-tabular form) by reading the customer
                ID from the operator and then print all his orders and also print the total price of
                all orders provided for this customer
                 */
                case 7:
                    /* Asking the user to enter the id of customer and use bill method to 
                    print all his orders and also print the total price of
                     all orders provided for this customer */
                    String idB;
                    System.out.print("enter the customer ID: ");
                    idB = input.nextLine();
                    bill(idB);
                    break;
                // case 8 is used to exit the program
                case 8:
                    System.out.println("\n  --------------<Thank you...>--------------\n");
                    break;

                // default for print mesaage that user enter unvalid chice
                default:
                    System.out.println("Invalid choice. Please try again.");
                
                }

        }while (choice != 8);
        input.close();
    }

}