package multithread;

public class MainClass {
    public static void main(String[] args) {
//        Thread t1 = new Thread( new MyClass());
//        t1.start();
        MyClassTwo t2 = new MyClassTwo();
        t2.start();
    }
}
