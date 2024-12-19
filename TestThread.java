
package pkg11;
class MyRunnable implements Runnable{
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getId()+"Running");
        }
        catch(InterruptedException e){
            System.out.println(e);
    
            
        }
    }
}


public class TestThread {
    public static void main(String[] args){
        MyRunnable mr1=new MyRunnable();
        Thread t1=new Thread(mr1);
        Thread t2=new Thread(mr1);
        Thread t3=new Thread(mr1);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
