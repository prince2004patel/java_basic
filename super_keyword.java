class Animal2{
    public void animalsound(){
        System.out.println("the animal make diff. sound");
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
