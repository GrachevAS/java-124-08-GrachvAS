package itmo.java.basics.lab6;

public class Client extends Human implements SpecialCondition{
    private String BankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        BankName = bankName;
    }

    @Override
    public void prinAllinfo() {
        System.out.println(Client.super.getFirstName()+" "+Client.super.getLastName()+" "+Client.this.BankName);
    }

    @Override
    public int interestRate() {
        return 15;//Формула расчета процентной ставки по кредиту для обычного клиента;
    }
}
