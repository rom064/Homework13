package hw13;

import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private String author;

    public Book(String author, String title, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String toString() {
        return "Название: "+getTitle()+" Автор: "+getAuthor()+" Год публикации: "+getYear();
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }
}