package multithread;

public class DurgSample {
    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        sample1.start();
        for (int i =0;i<10;i++) {
            System.out.println("Main Thread Executed");
        }
    }
}
