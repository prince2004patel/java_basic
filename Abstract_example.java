//Data abstraction is the process of hiding certain details and showing only essential information to the user
//Abstract class: is a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class).

//Abstract method: can only be used in an abstract class, and it does not have a body.
// The body is provided by the subclass (inherited from).

abstract class demo{
    abstract void callme(); //we cannot write in abstract method

    void callmetoo(){
        System.out.println("this is concrete method");
    }
}
class demo2 extends demo{
    @Override
    void callme() {
        System.out.println("demo2's implementation of callme");
    }
}
public class Abstract_example {
    public static void main(String[] args) {
        demo2 d = new demo2();
        d.callme();
        d.callmetoo();
    }
}
//we cannot create object of abstract class demo
