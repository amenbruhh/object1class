public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("George", "Orwell");
        Author author2 = new Author("Liu", "Cixin");
        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("The Three-Body Problem", author2, 2006);
        System.out.println("Книга 1: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getYearOfPublication());
        System.out.println("Книга 2: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getYearOfPublication());

        book2.setYearOfPublication(2008);

        System.out.println("\nИзменился год публикации:");
        System.out.println("Книга 2: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getYearOfPublication());
    }
}