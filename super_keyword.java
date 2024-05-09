//The super keyword refers to superclass (parent) objects. It is used to call superclass methods,
//and to access the superclass constructor. The most common use of the super keyword is to eliminate 
//the confusion between superclasses and subclasses that have methods with the same name.


class Animal2{
    public void animalsound(){
        System.out.println("all animal have diff. sound");
    }
}
class Dog2 extends Animal2{
    public void animalsound(){
        super.animalsound();
        System.out.println("dog like bowww");
    }
}
public class super_keyword {
    public static void main(String[] args) {
        Animal2 myDog = new Dog2();
        myDog.animalsound();
    }
}
