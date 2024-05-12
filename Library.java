package Task_3;

class Library {
    private Book[] books;
    private int numOfBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numOfBooks < books.length) {
            books[numOfBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < numOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--numOfBooks] = null;
                System.out.println("Book with ID " + bookID + " removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        if (numOfBooks == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < numOfBooks; i++) {
                System.out.println("ID: " + books[i].getBookID() + ", Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", Available: " + books[i].isAvailable());
            }
        }
    }
}


