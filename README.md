# Customer Orders System

This project is a **Customer and Order Management System** developed in Java. It allows a company to manage customer information, track their orders, and display bills in a well-organized and efficient manner. The system also includes validation checks for IDs, phone numbers, emails, and dates.

---

## Features

### Customers Management
- Add new customers.
- Display a list of all customers with their details.
- View detailed information about a specific customer.

### Order Management
- Add new orders for existing customers.
- Display all orders along with corresponding customer details.
- View detailed information about a specific order.
- Generate bills for customers, including the total price of their orders.

### Validation
- Ensure that:
  - Customer IDs are 10-digit numbers.
  - Phone numbers follow Saudi formats.
  - Emails are valid and follow specific domain rules.
  - Dates are within valid ranges.
  - Order statuses are valid (`NEW`, `PENDING`, `REFUSED`, `COMPLETE`).

---

## File Structure

```
project_1/
├── Company.java    # Main class handling customer and order management.
├── Customers.java  # Defines the customer structure and behavior.
├── Order.java      # Defines the order structure and behavior.
```

---

## How to Run the Program

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/project_1.git
   cd project_1
   ```

2. **Compile the Code:**
   Compile all `.java` files in the `project_1` directory:
   ```bash
   javac project_1/*.java
   ```

3. **Run the Program:**
   Execute the `Company` class:
   ```bash
   java project_1.Company
   ```

---

## Usage

1. Upon starting the program, you will see a menu with the following options:

   - **1:** Add a new customer by providing all required details.
   - **2:** Add a new order for an existing customer.
   - **3:** Display all customer information in tabular form.
   - **4:** Display all orders with customer details in tabular form.
   - **5:** View detailed information about a specific customer.
   - **6:** View detailed information about a specific order.
   - **7:** Generate and display a bill for a specific customer.
   - **8:** Exit the program.

2. Follow the on-screen prompts to provide necessary details (e.g., ID, name, order title).

---

## Example Interaction

### Adding a New Customer
```plaintext
1- Add a customer
ID: 1234567890
Name: John Doe
Address: Riyadh
Date of birth:
  enter the day: 15
  enter the month: 5
  enter the year: 1990
Mobile phone number (Saudi number): 0501234567
Email: john.doe@gmail.com
---------< Customer added successfully! >---------
```

### Adding a New Order
```plaintext
2- Add a new order to an existing customer
Customer ID: 1234567890
Enter order ID: 001
Enter the Title: Smartphone
Enter the Model of order: iPhone 14
Enter the weight of order: 0.5
Enter the Price of order: 4500
Enter this status (NEW, PENDING, REFUSED or COMPLETE): NEW
---------< Order added successfully! >---------
```

### Generating a Bill
```plaintext
7- Print a customer's bill
enter the customer ID: 1234567890
______________________________________________________________________________________________________________________________
| ID         | Name           | Address        | Date of birth | Mobile        | Email                                   |
______________________________________________________________________________________________________________________________
| 1234567890 | John Doe       | Riyadh         | 15/5/1990     | 0501234567    | john.doe@gmail.com                     |
______________________________________________________________________________________________________________________________
Customer's order/s:
|  Order ID             | Title     | Model          | Weight      | Price  | Status     |
________________________________________________________________________________________________
|  1234567890-001       | Smartphone| iPhone 14      | 0.5         | 4500   | NEW        |
________________________________________________________________________________________________
the total = 4500.0
```

---

## Validation Rules

- **ID:** Must be 10 digits long and numeric.
- **Phone Number:**
  - Must start with `05` if 10 digits.
  - Must start with `+9665` if 13 digits.
  - Must start with `009665` if 14 digits.
- **Email:**
  - Must include valid domains like `@gmail.com`, `@hotmail.com`, or `@st.uqu.edu.sa`.
- **Date of Birth:** Day (1-31), Month (1-12), Year (1920-2023).
- **Order Status:** Must be one of the following: `NEW`, `PENDING`, `REFUSED`, `COMPLETE`.

---

## Technologies Used

- **Java:** Programming language for building the application.
- **ArrayList:** Data structure for managing customers and orders.
- **Enums:** For defining order statuses.
- **Scanner:** For input handling.

---

