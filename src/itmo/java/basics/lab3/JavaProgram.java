package itmo.java.basics.lab3;

public class JavaProgram {
    public static void main(String[] args) {
    // Задание 1. Дописать в класс "Study"
        Study study1 = new Study("Изучение Java - это просто!");
        System.out.println(study1.printCourse());
    // Задание 2. Создать простой класс
        Car Car1 = new Car("White",1500D);
        Car Car2 = new Car ();
        Car2.setWeight(1600D);
        System.out.println(Car1.toString());
        System.out.println(Car2.getWeight());
    // Задание 3. Создать класс Дом
        House House1 = new House();
        House1.setName("Первый дом");
        House1.setFloors(5);
        House1.setConstructYear(1980);
        House House2 = new House();
        House2.setName("Втотрой дом");
        House2.setFloors(10);
        House2.setConstructYear(2000);
        System.out.println(House1.toString());
        System.out.println(House1.homeAge());
        System.out.println(House2.toString());
        System.out.println(House2.homeAge());
    // Заданеи 4. Создать класс Tree
        Tree Tree1 = new Tree();
        Tree Tree2 = new Tree(24,"Дерево №2");
        Tree Tree3 = new Tree("Дерево №3", 24,true);
        System.out.println(Tree1.toString());
        System.out.println(Tree2.toString());
        System.out.println(Tree3.toString());
    }
}
