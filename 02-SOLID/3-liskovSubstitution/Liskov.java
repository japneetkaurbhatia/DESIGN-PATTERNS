package liskovSubstitution;

public class Liskov {
    public static class Menu {
        public int price;
        public String name;

        Menu(int price, String name) {
            this.price = price;
            this.name = name;
        }

        public double getPrice() {
            return this.price;
        }
    }

    public static class Drinks extends Menu {
        Drinks(int price, String name) {
            super(price, name);
        }

        public double getPriceWithDiscount(int discountPercent) {
            return this.price - (discountPercent * 0.01 * this.price);
        }
    }

    public static void ItemPrice(Menu item) {
        if(item instanceof Drinks) {
            System.out.println(((Drinks) item).getPriceWithDiscount(10));
        } else {
            System.out.println(item.getPrice());
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu(100, "Burger");
        Drinks drinks = new Drinks(70, "Coke");

        ItemPrice(menu);
        ItemPrice(drinks);
    }
}
