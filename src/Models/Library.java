package Models;

import java.util.Arrays;

public class Library {
    public String name;
    public String city;
    public Book books[] = new Book[10];
    public int index = 0;

    public Library() {
    }

    public Library(String name, String city, Book[] books, int index) {
        this.name = name;
        this.city = city;
        this.books = books;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book) {
        try{
            books[index] = book;
            index += 1;
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("The library is full");
        }
    }

    public void printBooks(){
        for (var i: books) {
            try {
                System.out.println(i.toString());
            }catch (NullPointerException exception){
                System.out.println("The book is empty");
            }
        }
    }
}
