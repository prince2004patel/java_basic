//this example for set and get priority in thread

class pqr extends Thread
{
    public void run()
    {
        System.out.println("ABC running");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        pqr t1 = new pqr();
        t1.start();
        System.out.println(t1.getPriority());
        t1.setPriority(2);
        System.out.println(t1.getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}
//output
//5
//2
//Main
//ABC running