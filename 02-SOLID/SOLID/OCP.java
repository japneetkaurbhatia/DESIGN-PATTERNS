public class OCP {
    // Open Closed Principle
    // The Open Closed Principle states that a class should be open for extension but closed for modification.

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

    // now if want to add a new method in it then it will not follow OCP
    public class InvoiceDBHandler {
        Invoice invoice;

        public InvoiceDBHandler(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB(Invoice invoice) {
            // Save the invoice details to the database
            // Implementation goes here
        }

        public void saveToSystem(Invoice invoice) {
        }
    }

    // we can do extension of class by following method so that it fllow OCP
    interface InvoiceSaver {
        void save(Invoice invoice);
    }

    class DatabaseInvoiceSaver implements InvoiceSaver {
        @Override
        public void save(Invoice invoice) {
            // Save the invoice details to the database
            // Implementation goes here
        }
    }

    class SystemInvoiceSaver implements InvoiceSaver {
        @Override
        public void save(Invoice invoice) {
            // Save the invoice details to the system
            // Implementation goes here
        }
    }
}
