package lamda.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Laptop",150000.0),
                new Product("applePhone",300000.0),
                new Product("Tablet",50000.0),
                new Product("mouse",50000.0)
                );
        System.out.println("=======Product 리스트=======");
        products.forEach(System.out::println);

        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                //.collect(Collectors.toList());
                //하거나 바로
                .toList(); //list를 새로 만든다.
        System.out.println("=======가격별 정렬된 Product 리스트=======");
        //정렬된 새 list를 forEach를 사용하여 출력

        sortedProducts.forEach(System.out::println);
    }
}
