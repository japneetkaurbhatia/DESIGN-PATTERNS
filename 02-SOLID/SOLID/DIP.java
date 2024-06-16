public class DIP {
    // Dependency Inversion Principle
    // Classes should depend on interface, not on concrete implementations.
    interface Keyboard {
        void wired();

        void bluetooth();
    }

    interface Mouse {
        void wired();

        void bluetooth();
    }

    class MacBook {
        private final WiredKeyboard keyboard;
        private final WiredMouse mouse;

        public MacBook() {
            this.keyboard = new WiredKeyboard();
            this.mouse = new WiredMouse();
        }
    }
    // This is not following DIP as the MacBook class is depending on concrete
    // implementations
    // Now if we want to change the keyboard or mouse then we have to change the
    // code of MacBook class

    // Implementing DIP
    class MacBook {
        private final Keyboard keyboard;
        private final Mouse mouse;

        public MacBook(Keyboard keyboard, Mouse mouse) {
            this.keyboard = keyboard;
            this.mouse = mouse;
        }
    }
}
