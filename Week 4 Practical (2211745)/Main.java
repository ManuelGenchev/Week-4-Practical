public class Main {

    public static void main(String[] args) {
        // Task 1 and 2
        // Creating an instance of the Person class
        Person person1 = new Person("John Doe", 25, new Address("Example street", "Example City", "Example State", "262778"));

        // Displaying information
        person1.displayInfo();

        // Updating information using setter methods
        person1.setName("Manuel");
        person1.setAge(20);

        // Displaying updated information
        person1.displayInfo();

        // Task 3
        // Creating an instance of the Book class
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

        // Displaying book details
        book1.displayDetails();

        // Updating book information using setter methods
        book1.setPrice(12.99);

        // Displaying updated book details
        book1.displayDetails();
    }
}