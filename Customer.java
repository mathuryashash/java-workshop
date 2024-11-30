import java.io.Serializable;

public class Customer implements Serializable, Comparable<Customer> {
    private int id;
    private double balance;
    private String firstName;
    private String lastName;

    // Constructor
    public Customer(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Implementing compareTo for sorting based on First Name, Last Name, ID, and Balance
    @Override
    public int compareTo(Customer other) {
        // First compare by firstName
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) return firstNameComparison;

        // Then compare by lastName if first names are equal
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) return lastNameComparison;

        // Then compare by ID if first and last names are equal
        int idComparison = Integer.compare(this.id, other.id);
        if (idComparison != 0) return idComparison;

        // Finally, compare by balance if all other fields are equal
        return Double.compare(this.balance, other.balance);
    }

    // Override toString to print customer details
    @Override
    public String toString() {
        return "Customer[ID=" + id + ", Name=" + firstName + " " + lastName + ", Balance=" + balance + "]";
    }
}