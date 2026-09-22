abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Woof");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Meow");
    }
}

public class OOPPrinciples {

    public static void main(String[] args) {

        Animal dog = new Dog("Bruno");
        Animal cat = new Cat("Kitty");

        dog.sound();
        cat.sound();
    }
}