package lamda.dh;

import java.util.Arrays;
import java.util.List;

public class Lamda1 {
    public static void main(String[] args) {
        List<Integer> listinteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int total = listinteger.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(total);
    }
}
