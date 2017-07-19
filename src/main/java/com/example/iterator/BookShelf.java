package com.example.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ko-aoki on 2017/06/24.
 */
public class BookShelf implements Aggregate<Book> {

    private List<Book> bookList = new ArrayList<>();

    public Book getBookAt(int index) {
        if (index > this.bookList.size() - 1) {
            return null;
        }
        return this.bookList.get(index);
    }

    public void appendBook(Book book) {
        this.bookList.add(book);
    }

    public int getLength() {
        return this.bookList.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
