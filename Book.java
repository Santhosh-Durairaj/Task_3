package Task_3;

public class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookID, String title, String author, boolean isAvailable){
        this.bookID = bookID;
        this.author = author;
        this.title=title;
        this.isAvailable = true;
    }
    public int getBookID(){
        return bookID;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }

}
