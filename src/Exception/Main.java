package Exception;

import Models.Book;
import Models.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library firstLib = new Library();
        Library secondLib = new Library();
        Book firstLibBook = new Book(0, "The Witcher", "Andrzej Sapkowski");
        Book secondLibBook = new Book(1, "Metro 2033", "Dmitry Glukhovsky");

        firstLib.addBook(firstLibBook);
        firstLib.addBook(firstLibBook);
        firstLib.addBook(firstLibBook);
        firstLib.addBook(firstLibBook);
        firstLib.addBook(firstLibBook);
        firstLib.addBook(firstLibBook);
        secondLib.addBook(secondLibBook);
        secondLib.addBook(secondLibBook);
        secondLib.addBook(secondLibBook);
        secondLib.addBook(secondLibBook);
        secondLib.addBook(null);
        secondLib.addBook(secondLibBook);

        secondLib.printBooks();
    }
}
