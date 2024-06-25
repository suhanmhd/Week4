package lambda;

import java.util.function.Predicate;

public class PredicateCheck {
    public static void main(String[] args) {

        Predicate<String> p = str ->  str.length()>2;
        System.out.println(p.test("sdfsdf"));
    }
}
