package itmo.java.basics.lab6;

public class Lab6 {
    public static void main(String[] args) {
        Client client1 = new Client("Ivanov", "Ivan", "VTB");
        BankEmployee bankEmployee1 = new BankEmployee("Petrov", "Petr", "T-bank");
        client1.prinAllinfo();
        bankEmployee1.prinAllinfo();
//2.	Интерфейсы
        System.out.println("Процентная ставка клиента:"+client1.interestRate());
        System.out.println("Процентная ставка работника банка"+bankEmployee1.interestRate());
//3.	Есть класс автомобиль. Добавьте класс Грузовик, который будет наследовать все от класса Автомобиль
        Truck track1 = new Truck(2500, "Volvo",'R', 160f, 6, 15000);
//4.    Создайте два класса: главный и класс-наследник.
        Child child1 = new Child();
        child1.setParam(100);
        child1.printParentVar();
//5.	Создайте главный класс. Добавьте в него:
//●	метод для получения возраста пользователя;
//
//Создайте класс-наследник. Добавьте в него:
//●	переопределенный метод для получения имени пользователя;
//
//Создайте объект на основе класса-наследника и используйте для него метод из класса.

        SlaveUser user1 = new SlaveUser();
        user1.setVar();
        System.out.println(user1.userName);




    }
}
