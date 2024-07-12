public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("George", "Orwell");
        Author author2 = new Author("Liu", "Cixin");
        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("The Three-Body Problem", author2, 2006);
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book2.setYearOfPublication(2008);

        System.out.println("\nИзменился год публикации:");
        System.out.println(book2.toString());
    }
}