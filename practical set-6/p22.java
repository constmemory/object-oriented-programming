/*
Define a custom exception class BookNotAvailableException that extends Exception.
● Create a class Library with :  
● An instance variable availableBooks (integer).  
● A method issueBook(int count) that :  
  o If count <= availableBooks, reduce the number of books and display "Book issued successfully".  
  o Otherwise, throw BookNotAvailableException with the message "Requested books not available".  
In the main() method :  
● Initialize the library with 3 available books.  
● Try issuing 2 books (valid).  
● Then try issuing 2 more books (should throw the custom exception).
*/

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } 
        else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class p22 {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            lib.issueBook(2);
            lib.issueBook(2);
        }
        catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
