package app;

import pacote1.Dog;
import pacote1.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Word!");
        Dog d1 = new Dog();
        Person p1 = new Person();
        d1.bark();
        p1.hello();
    }
}
