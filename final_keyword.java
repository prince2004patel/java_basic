//The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

public class final_keyword {
    final int x = 10;

    public static void main(String[] args) {
        final_keyword Obj = new final_keyword();
        Obj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(Obj.x);
    }
}
