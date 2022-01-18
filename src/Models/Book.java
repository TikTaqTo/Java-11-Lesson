package Models;

public class Book {
    public int Id;
    public String Name;
    public String Author;

    public Book() {
    }

    public Book(int id, String name, String author) {
        Id = id;
        Name = name;
        Author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
