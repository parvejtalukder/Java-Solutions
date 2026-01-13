class BookInfo extends Book {

    BookInfo(String a, String b, double c) {
        super(a, b, c);
    }

    @Override
    void bookCard() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }   
}