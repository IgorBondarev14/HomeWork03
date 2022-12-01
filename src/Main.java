import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.");
        ArrayList<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("blue");
        myList.add("green");
        myList.add("white");
        myList.add("black");
        myList.add("yellow");
        System.out.println(myList);

        System.out.println("2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.");
        for (int i = 0; i < myList.size(); i++) {
            StringBuilder strBld = new StringBuilder(myList.get(i));
            strBld.append('!');
            myList.set(i, strBld.toString());
        }
        System.out.println(myList);

        System.out.println("3. Вставить элемент в список в первой позиции.");
        myList.add(0, "pink!");
        System.out.println(myList);

        System.out.println("4. Извлечь элемент (по указанному индексу) из заданного списка.");
        System.out.println(myList.get(4));

        System.out.println("5. Обновить определенный элемент списка по заданному индексу.");
        myList.set(4, "white-red!");
        System.out.println(myList);

        System.out.println("6. Удалить третий элемент из списка.");
        myList.remove(3);
        System.out.println(myList);

        System.out.println("7. Поиска элемента в списке по строке.");
        System.out.println(myList.contains("red!"));

        System.out.println("8. Создать новый список и добавить в него несколько елементов первого списка.");
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            newList.add(myList.get(i));
        }
        System.out.println(newList);

        System.out.println("9. Удалить из первого списка все элементы отсутствующие во втором списке.");
        myList.retainAll(newList);
        System.out.println(myList);

        System.out.println("10. *Сортировка списка.");
        myList.add("green!");
        myList.add("white!");
        myList.add("black!");
        myList.add("yellow!");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        System.out.println("11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.");
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            myList.add(0, "pink!");
        }
        long finish = System.nanoTime();
        long workTime = finish - start;
        System.out.println("Время выполненения добавления 1 000 строк в ArrayList составило: " + workTime);
        LinkedList<String> lList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            lList.add(0, "pink!");
        }
        finish = System.nanoTime();
        workTime = finish - start;
        System.out.println("Время выполненения добавления 1 000 строк в LinkedList составило: " + workTime);
    }
}