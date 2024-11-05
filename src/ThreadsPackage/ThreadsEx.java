package ThreadsPackage;

class Multithread extends Thread {
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ThreadsEx {
    public static void main(String[] args){
        Multithread t1 = new Multithread();
        Multithread t2 = new Multithread();

        t1.start();
        t2.start();
    }
}
