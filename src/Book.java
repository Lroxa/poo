public class Book {
    String title;
    String author;
    int pages;

    public Book( String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void reading () {
        System.out.println("You are reading" + title);
    }
    public void writer () {
        System.out.println("the writer is" + author);
    }
    public void length () {
        System.out.println("The book has " + pages + " pages");
    }
}

