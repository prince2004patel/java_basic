//multiple thread can achieve by Runnable or extending thread

class PQR implements Runnable{
    String name;
    PQR(String str){
        name = str;
        Thread t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println(name +" is running " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread is interrupted" + e);
        }
    }
}
public class Multiple_thread {
    public static void main(String[] args) {
        PQR ob1 = new PQR("Thread1");
        PQR ob2 = new PQR("Thread2");
    }
}
