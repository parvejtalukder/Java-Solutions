abstract class Book {
    String title;
    String author;
    double price;

    Book(String a, String b, double c) {
        this.title = a;
        this.author = b;
        this.price = c;
    }

    abstract void bookCard();
}