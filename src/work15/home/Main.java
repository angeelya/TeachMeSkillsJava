package work15.home;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        workWithArrayListFromStream();
        System.out.println("Task*");
        reverseNameFromMap();
    }
    //Задача *:
    //Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
    //этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
    //Среди отобранных значений отобрать только те, которые имеют нечетное количество
    //букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
    private static void reverseNameFromMap() {//task*
        Map<Integer, String> listPeople = new HashMap<>();
        List result, diapason = Arrays.asList(1, 2, 5, 8, 9, 13);
        listPeople.put(1, "Irina");
        listPeople.put(2, "Alice");
        listPeople.put(3, "John");
        listPeople.put(4, "Andrew");
        listPeople.put(5, "Anton");
        listPeople.put(6, "Evgeny");
        listPeople.put(7, "Ivan");
        listPeople.put(8, "Mike");
        listPeople.put(9, "Daria");
        listPeople.put(10, "Angelina");
        listPeople.put(11, "Julia");
        listPeople.put(12, "Uliana");
        listPeople.put(13, "Ekaterina");
        result = listPeople.entrySet().stream().
                filter((x) -> diapason.contains(x.getKey()) && x.getValue().length() % 2 != 0).
                map(Map.Entry::getValue).map(name -> new StringBuilder(name).reverse().toString())
                .toList();
        System.out.println(result);
    }
    //Задача 1:
    //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
    // Stream'ов:
    //  - Удалить дубликаты
    //  - Оставить только четные элементы
    //  - Вывести сумму оставшихся элементов в стриме
    private static void workWithArrayListFromStream() {//task1
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 21, 34));
        System.out.println(arr);
        int sum = arr.stream().distinct().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
    }
}
