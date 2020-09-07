import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    Map<String, ArrayList<String>> phoneBook = new TreeMap<>();

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) { //есть фамилия
            phoneBook.get(name).add(number); //добавить номер
            System.out.println("Номер добавлен в справочник");
        } else { //новая фамилия
            ArrayList<String> num = new ArrayList<>(); //новый массив
            num.add(number); //добавить номер в массив
            phoneBook.put(name, num); //добавить фамилию и массив в библиотеку
            System.out.println("Номер и фамилия добавлены в справочник");
        }
    }

    public void get(String name) {
        if (phoneBook.containsKey(name)) { //есть фамилия
            System.out.printf("\n\n%s : %s", name, phoneBook.get(name));
        } else { //нет фамилии
            System.out.printf("\n\nФамилии \"%s\" нет в справочнике", name);
        }
    }
}
