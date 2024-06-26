package itmo.java.basics.lab6;

public class SlaveUser extends MasterUser{
    @Override
    public void setVar() {
        System.out.print("Введите имя:");
        super.userName = scanner.nextLine();
    }
}
