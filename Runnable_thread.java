//The easiest way to create a thread is to create a class that implements the Runnable interface.
//To implement Runnable interface, a class need only implement a single method called
//run( ), which is declared like this:-- public void run( );
// Inside run( ), we will define the code that constitutes the new thread.
class ABC implements Runnable{
    public void run(){
        System.out.println("ABC running by using the Runnable ");
    }
}
public class Runnable_thread {
    public static void main(String[] args) {
        ABC obj = new ABC();
       Thread t1 = new Thread(obj);
        t1.start();
    }
}
//A Thread is a very light-weighted process, or we can say the smallest part of the process
// that allows a program to operate more efficiently by running multiple tasks simultaneously.
