package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,45,6,798,4,1,7,5, 3);
        List<Integer>newlist  = new ArrayList<>();
            newlist= list.stream().filter(n -> n%2==0).map(n -> n *2).collect(Collectors.toList());
        System.out.println(newlist);
    }
}
