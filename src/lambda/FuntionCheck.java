package lambda;

import java.net.Inet4Address;
import java.util.function.Function;

public class FuntionCheck {
    public static void main(String[] args) {
        Function<Integer,Integer> fn = n -> n*n;
        System.out.println(  fn.apply(10));

    }
}
