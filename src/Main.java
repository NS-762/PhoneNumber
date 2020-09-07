public class Main {

    public static void main(String[] args) {

        Phonebook book = new Phonebook();

        book.add("Иванов", "73-17-65");
        book.add("Петров", "83-56-34");
        book.add("Иванов", "99-99-65");

        book.get("Иванов");
        book.get("Петров");
        book.get("Александров");
    }
}
