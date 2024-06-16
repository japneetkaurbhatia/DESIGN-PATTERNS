public class LSP {
    // Liskov Substitution Principle
    // If Class B is a subclass of Class A, then Class A objects can be replaced
    // with Class B objects without affecting the program's functionality.
    // Subclass should extend the functionality of the parent class and not narrow
    // it.

    interface Bike {
        void turnOnEngine();

        void accelerate();
    }

    class Motorcycle implements Bike {
        boolean engineOn;
        int speed;

        @Override
        public void turnOnEngine() {
            // implementation for turning on the engine of a motorcycle
            engineOn = true;
        }

        @Override
        public void accelerate() {
            // implementation for accelerating a motorcycle
            speed += 10;
        }
    }

    class Bicycle implements Bike {
        boolean engineOn;
        int speed;

        @Override
        public void turnOnEngine() {
            throw new UnsupportedOperationException("Bicycles do not have engines");
        }

        @Override
        public void accelerate() {
            // implementation for accelerating a motorcycle
        }
    }
    // this is not following LSP as the Bicycle class is not extending the
    // functionality of the parent class Bike

}
