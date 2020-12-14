package wk2_iterator.api.impl;

import wk2_iterator.api.Iterator;

public class BookShelflterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelflterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
