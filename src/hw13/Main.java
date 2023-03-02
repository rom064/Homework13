package hw13;

public class Main {
    /* Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
Обратите внимание, что toString книги не должен дублировать код из toString автора,
 а должен делегировать (вызывать) его версию метода. */
    public static void main(String[] args) {
        Book lolita = new Book("Набоков", "\"Лолита\"", 1955);
        Author nabokov = new Author("Владимир Владимирович", "Набоков");
        System.out.println(lolita);
        System.out.println(nabokov);
        System.out.println();
        Book idiot = new Book("Достоевский", "\"Идиот\"", 1867);
        Author dostoevsky = new Author("Федор Михайлович", "Достоевский");
        System.out.println(idiot);
        System.out.println(dostoevsky);
        System.out.println(idiot.equals(lolita));
        System.out.println(nabokov.equals(dostoevsky));
    }}