package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(34,21,44,12,3,78);
    List<Integer> evenlist = new ArrayList<>();


       evenlist= list.stream().filter(p -> p%2==0).collect(Collectors.toList());
        System.out.println(evenlist);

        list.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
    }
}
