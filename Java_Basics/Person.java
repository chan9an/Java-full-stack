class Person {
    int id;
    String name;

    // Constructor
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to print details
    void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person(1, "John Doe");
        // Print details
        person.printDetails();
    }
}
