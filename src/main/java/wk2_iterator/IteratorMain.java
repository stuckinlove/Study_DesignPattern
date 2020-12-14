package wk2_iterator;

import wk2_iterator.api.Iterator;
import wk2_iterator.api.impl.Book;
import wk2_iterator.api.impl.BookShelf;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1st Book"));
        bookShelf.appendBook(new Book("2nd Book"));
        bookShelf.appendBook(new Book("3rd Book"));
        bookShelf.appendBook(new Book("4th Book"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
