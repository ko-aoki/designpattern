package com.example.iterator;

/**
 * Created by ko-aoki on 2017/06/24.
 */
public class IteratorMain {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));

        Iterator<Book> iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
