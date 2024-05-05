This project for the Object-Oriented Programming course entails developing a Java console application for a Company, implementing various OOP concepts. The application manages customer and order data, utilizing ArrayList collection objects.

Each customer is characterized by unique identifiers, including ID, name, address, date of birth, mobile phone number, and email. Customer data is stored within an ArrayList collection.

Customers can place orders, with each order possessing attributes such as ID, title, model, weight, price, and status. The status field is restricted to values: NEW, PENDING, REFUSED, and COMPLETE, implemented using Enum.

The testing class, 'Company.java,' features a static main() method and includes the following functionalities:

1. Addition of a new customer with all necessary information.
2. Addition of a new order for an existing customer.
3. Printing of all customer information, excluding order data, in a well-tabular format.
4. Printing of all order information, along with corresponding customer ID and name, in a well-tabular format.
5. Displaying specific customer data, including their orders, by inputting the customer ID.
6. Displaying specific order data, along with the corresponding customer's ID and name, by inputting the order ID.
7. Printing a specific customer's bill, including all orders and the total price, by inputting the customer ID.
8. Exiting the program.

The application ensures a user-friendly interface with a selection screen, allowing the operator to navigate through the functionalities until choosing to exit.
