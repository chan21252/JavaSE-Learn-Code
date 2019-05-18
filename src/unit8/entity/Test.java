package unit8.entity;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Food rice = new Rice();
        Food flour = new Flour();
        Food meat = new Meat();

        person.eat(rice);
        person.eat(flour);
        person.eat(meat);
    }
}
