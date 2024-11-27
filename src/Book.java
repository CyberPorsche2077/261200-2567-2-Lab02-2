public class Book {
    String title = "";
    String author = "";
    double price = 0.0;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }

    public void displayDetails() {
        if (price > 0.0) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }else {
            System.out.println("Invalid Number");
        }
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
        if (newPrice < 0.0){
            System.out.println("Invalid Number");
        }
    }

    public void applyDiscount(double discount){
        if(price>0.00) {
            if (discount > 100.00) {
                System.out.println("Error Discount");
            } else if (discount < 0.00) {
                System.out.println("Error Discount");
            } else {
                price = price - price * (discount / 100.00);
                System.out.println("Your price has been update.");
                System.out.println("Discounted price: " + price);
            }
        }else{
            System.out.println("Invalid price");
        }
    }

    public static void main(String arg[]){
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(100.00);
        hp1Book.displayDetails();

        hp1Book.applyDiscount (0.5);
    }
}