package itmo.java.basics.lub9;

import java.util.*;
import java.util.ArrayList;

import static java.lang.System.currentTimeMillis;


public class Lab9 {
    public static void main(String[] args) {
//9.2 написать метод, который на входе получает коллекцию объектов, а возвращает уже коллекцию без дубликатов
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add((int) ((Math.random() * 10)));
        }
        System.out.println(list);
        System.out.println(ListMethod.uniqCollection(list));

//9.3
//        List<Integer> bigList = new ArrayList<>();
//        List<Integer> bigListSelection = new ArrayList<>();
//        List<Integer> bigLinkedList = new LinkedList<>();
//        List<Integer> bigLinkedListSelection = new ArrayList<>();
//        for (int i=1;i<1000000;i++) {
//            bigList.add((int) ((Math.random() * 10)));
//            bigLinkedList.add((int) ((Math.random() * 10)));
//        }
//        long startBigList = currentTimeMillis();
//        System.out.println(startBigList);
//        for (int i = 0; i < 100000; i++) {
//            bigListSelection.add(bigList.get((int) ((Math.random() * 1000000))));
//        }
//        long endBigList = currentTimeMillis();
//        System.out.println(endBigList);
//        System.out.println(endBigList-startBigList);
//
//        long startBigLinkedList = currentTimeMillis();
//        System.out.println(startBigLinkedList);
//        for (int i = 0; i < 100000; i++) {
//            bigLinkedListSelection.add(bigLinkedList.get((int) ((Math.random() * 1000000))));
//        }
//        long endBigLinkedList = currentTimeMillis();
//        System.out.println(endBigLinkedList);
//        System.out.println(endBigLinkedList-startBigLinkedList);

//9.4
        User ivanov = new User("Иванов");
        User petrov = new User("Петров");
        User sidorov = new User("Сидоров");
        Set<User> users = new HashSet<>();
        users.add(ivanov);
        users.add(petrov);
        users.add(sidorov);
        Map<User, Integer> map = new HashMap<>();
        map.put(ivanov, (int) ((Math.random() * 10)));
        map.put(petrov, (int) ((Math.random() * 10)));
        map.put(sidorov, (int) ((Math.random() * 10)));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите name:");
        String string = scanner.nextLine();

        User targetUser = MapSearch.searchUser(users, string);
        if (targetUser == null) {
            System.out.println("Данный игрок отсутствует");
        } else
            System.out.println("Количество очков игрока " + string + " = " + MapSearch.SearchValueByKey(map, targetUser));
    }
}
