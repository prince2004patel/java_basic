//When two or more threads need access to a shared resource,they need some way to
//ensure that the resource will be used by only one thread at a time. The by which this is
//achieved is called Synchronization.
//There are two way to achieve synchronization
//1) Using Synchronized Methods
//2) Using Synchronized block

//now using methods
class xyz{
        synchronized public void display(String name){
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
class abc extends Thread{
    String name;
    xyz syob1;

    abc(xyz ob1,String str){
        syob1=ob1;
        name=str;
        start();
    }
    public void run(){
        syob1.display(name);
    }
}
public class Synchronization_example {
    public static void main(String[] args) {
        xyz syob1 = new xyz();

        abc ob1 = new abc(syob1,"Thread1");
        abc ob2 = new abc(syob1,"Thread2");
    }
}
