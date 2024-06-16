class SRP {
    // A class should have one reason to change
    public class Marker {
        private String color;
        private int year;
        private int name;
        private int price;

        public Marker(String color, int year, int name, int price) {
            this.color = color;
            this.year = year;
            this.name = name;
            this.price = price;
        }
    }

    // currently this class is not following single responsibility principle because
    // it is doing more than one thing and we have many reasons to change class
    public class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public double calculate() {
            // Calculate the total price of markers in the invoice
            return marker.getPrice() * quantity;
        }

        public void printInvoice() {
            // Print the invoice details
            System.out.println("Invoice Details:");
            System.out.println("Marker: " + marker.getName());
            System.out.println("Color: " + marker.getColor());
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price: $" + calculate());
        }

        public void saveToDB() {
            // Save the invoice details to the database
            // Implementation goes here
        }
    }

    // We can change this class to follow single responsibility principle by
    // creating a new class to handle the database operations
    public class InvoiceDBHandler {
        Invoice invoice;

        public InvoiceDBHandler(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB(Invoice invoice) {
            // Save the invoice details to the database
            // Implementation goes here
        }
    }

    public class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public double calculate() {
            // Calculate the total price of markers in the invoice
            return marker.getPrice() * quantity;
        }
    }

    class InvoicePrinter {
        private Invoice invoice;

        public InvoicePrinter(Invoice invoice) {
            this.invoice = invoice;
        }

        public void printInvoice() {
            // Print the invoice details
            System.out.println("Invoice Details:");
            System.out.println("Marker: " + marker.getName());
            System.out.println("Color: " + marker.getColor());
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price: $" + calculate());
        }
    }

    /*
     * Advantages of Single Responsibility Principle:
     * Avoids code duplication: When a class has multiple responsibilities, there is
     * a higher chance of code duplication. By separating the responsibilities into
     * different classes, we can avoid code duplication.
     * Easier to maintain: When a class has a single responsibility, it is easier to
     * maintain and modify the code. Changes to one responsibility will not affect
     * other responsibilities.
     * easy to understand: When a class has a single responsibility, it is easier to
     * understand the code and its purpose. This makes the code more readable and
     * maintainable.
     * Flexible and reusable: Classes with single responsibilities are more flexible
     * and reusable. They can be easily reused in other parts of the codebase
     * without affecting other responsibilities.
     * Reduce Complexity: Single Responsibility Principle helps in reducing the
     * complexity of the code by breaking down the functionality into smaller,
     * manageable parts.
     */
}