package itmo.java.basics.lab6;

public abstract class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void prinAllinfo();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
