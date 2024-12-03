public class Book{
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
      } 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("price: " + price);
    }
    public void updatePrice(double newPrice) {
        if(newPrice < 0){
            System.out.println("Invalid price : setting price to 0.0");
            this.price = 0.0 ;
        }
        else {this.price = newPrice;
        }
    }
    public void applyDiscount(double discount_percentage){
        if(discount_percentage > 0.0 && discount_percentage < 100.0){
            System.out.println("discount : " + discount_percentage + " %");
            this.price = price * ((100.0 - discount_percentage)/100) ;
            System.out.println("New price after the discount applied : " + price);
        }
        else {System.out.println("Error: Discount must be between 0.0 and 100.0");
        }
    }
    public static void main(String[] args){
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000);
        hp1Book.displayDetails();

        hp1Book.applyDiscount(150);
        hp1Book.displayDetails();

        hp1Book.applyDiscount(-50);
        hp1Book.displayDetails();

        hp1Book.applyDiscount(50);
        hp1Book.displayDetails();
    }
}
