package ahsan.lav_4;

class LibraryItem {
    final int itemId;
    static int totalItems=0;
    
    LibraryItem(int itemId) {
        this.itemId=itemId;
        totalItems++;
    }
   static int getTotalItemCount() {
        return totalItems;
    }
   int getItemId() {
        return itemId;
    }
}


class Book extends LibraryItem {
    String title;
    String author;
    Book(int itemId, String title, String author) {
        super(itemId);
        this.title = title;
        this.author = author;
    }

    void displayBookInfo() {
        System.out.println("Added book: \"" +title + "\" by " + author + ".");
    }
}



public class Task4_2 {
    public static void main(String[] args) {
       
        Book b1 = new Book(1, "1984","George Orwell");
        b1.displayBookInfo();

        Book b2 = new Book(2, "The Catcher in the Rye", "J.D. Salinger");
        b2.displayBookInfo();

        Book b3 = new Book(3, "To Kill a Mockingbird", "Harper Lee");
        b3.displayBookInfo();

         System.out.println("Total library items: " + LibraryItem.getTotalItemCount());
    }
}
