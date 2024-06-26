package itmo.java.basics.lab6;

public class BankEmployee extends Human implements SpecialCondition {
    private String bankName;

    @Override
    public void prinAllinfo() {
        System.out.println(BankEmployee.super.getFirstName()+" "+BankEmployee.super.getLastName()+" "+BankEmployee.this.bankName);
    }

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;


    }

    @Override
    public int interestRate() {
        return 9; //Формула расчета специальной ставки по кредиту как работника банка
    }
}



