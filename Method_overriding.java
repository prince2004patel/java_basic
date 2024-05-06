//If subclass (child class) has the same method as declared in the parent class,
// it is known as method overriding in Java.

class Animal {
    void makeSound() {
        System.out.println("all anime have diff. sound");
    }
}

class Dog extends Animal {
    // Method overriding
    void makeSound() {
        System.out.println("cat like meow meow");
    }
}

public class Method_overriding {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound();
        dog.makeSound();
    }
}