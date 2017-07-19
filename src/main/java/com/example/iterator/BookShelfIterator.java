package com.example.iterator;

/**
 * Created by ko-aoki on 2017/06/24.
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {

        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index >= this.bookShelf.getLength()) {
            return  false;
        }
        return true;
    }

    @Override
    public Book next() {
        Book book = this.bookShelf.getBookAt(this.index);
        index++;
        return book;
    }
}
