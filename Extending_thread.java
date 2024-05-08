//In this method, create a new class that extends Thread.
//Then override the run() method and create an instance of that class.
//After that, call start() method to execute run() method.
class XYZ extends Thread{
    public void run(){
        System.out.println("XYZ running by using extending the thread");
    }
}
public class Extending_thread {
    public static void main(String[] args) {
        XYZ t1 = new XYZ();
        t1.start();
    }

}
//Another benefit of using thread is that if a thread gets an exception or an error at the time of its execution,
// it doesn't affect the execution of the other threads. All the threads share a common memory and have their own stack,
// local variables and program counter.
