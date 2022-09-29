package liskovSubstitution;

public class LiskovSubstitution {
    public static class Menu {
        public int price;
        public String name;

        Menu(int price, String name) {
            this.price = price;
            this.name = name;
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        private double getDiscount() {
            return 0;
        }
    }

    public static class Drinks extends Liskov.Menu {
        Drinks(int price, String name) {
            super(price, name);
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        private double getDiscount() {
            int discountPercent = 10;
            return discountPercent * 0.01 * this.price;
        }
    }

    public static void ItemPrice(Liskov.Menu item) {
        System.out.println(item.getPrice());
    }

    public static void main(String[] args) {
        Liskov.Menu menu = new Liskov.Menu(100, "Burger");
        Liskov.Drinks drinks = new Liskov.Drinks(70, "Coke");

        ItemPrice(menu);
        ItemPrice(drinks);
    }
}
