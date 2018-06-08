public @interface Author {
    String first();
    String last();
}

class TestAuthor {

    @Author(first = "Lokesh", last = "Gupta")
    Book book = new Book();
}

class Book {

}