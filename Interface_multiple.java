//An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//interface does not contain any type of  body,it's like abstract class and method
// using interface, we can use multiple and  hybrid inheritance
// for interface, we use implements keyword

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Bird implements Flyable,Swimmable{
    public void fly(){
        System.out.println("birds can fly");
    }
    public void swim(){
        System.out.println("birds can swim");
    }
}
public class Interface_multiple {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
