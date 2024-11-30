import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Creating a list of customers
        List<Customer> customers = new ArrayList<>();

        // Ask user for the number of customers to input
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Collect customer details from the user
        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Enter details for Customer " + (i + 1));

            // Get customer ID
            System.out.print("Enter Customer ID: ");
            int id = scanner.nextInt();

            // Get customer first name
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            // Get customer last name
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            // Get customer balance
            System.out.print("Enter Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            // Create a new Customer object and add it to the list
            customers.add(new Customer(id, firstName, lastName, balance));
        }

        // Sort the list of customers
        Collections.sort(customers);

        // Display the sorted list of customers
        System.out.println("\nSorted List of Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // Close the scanner
        scanner.close();
    }
}