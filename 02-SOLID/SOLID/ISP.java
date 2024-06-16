public class ISP {
    // Interface Segregation Principle
    // The Interface Segregation Principle states that a client should not be forced
    // to implement an interface that it does not use.

    interface Restaurant {
        void washDished();

        void serveCustomer();

        void cookFood();
    }

    class waiter implements Restaurant {
        @Override
        public void washDished() {
            // not my job
        }

        @Override
        public void serveCustomer() {
            // implementation for serving customer
            System.out.println("Serving food to customer");
        }

        @Override
        public void cookFood() {
            // not my job
        }
    }
    // this is not fllowing ISP as the waiter class is implementing the methods that
    // it is not using

    // Following ISP below
    interface WaiterInterface {
        void serveCustomer();
    }

    interface ChefInterface {
        void cookFood();
    }

    interface CleanerInterface {
        void washDishes();
    }

    class waiter implements WaiterInterface {
        @Override
        public void serveCustomer() {
            // implementation for serving customer
            System.out.println("Serving food to customer");
        }
    }

}
