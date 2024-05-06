
//The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
// We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

//Private: The access level of a private modifier is only within the class.
// It cannot be accessed from outside the class.

class A{
    private int data= 40;
    private void msg(){
        System.out.println("hello, this is private ");
    }
}
public class Private_keyword {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);   //compile time error
        obj.msg();  //compile time error
    }

}
