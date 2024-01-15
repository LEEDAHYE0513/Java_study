package stream.section2.product;
import stream.section2.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;


public class ProductStreamEx {
    public static void main(String[] args) {
        //1. 외부 반복자 fori를 이용하여 Product를 생성할 때
        // 제품번호 => i, 상품명 => 상품명 + i, "shinesegae" ,가격 random()메소드로 책정하여
        //10개 생성하여 리스트 컬렉션 productList에 저장합니다.

        Random random = new Random();
        //int productNo, String name, String company, Integer price
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 3 ; i++) {
            Product product = new Product(i, "혜지언니는 다혜가 아니야."+i, "shinesegae", random.nextInt(10000));
            productList.add(product);
        }
        //2. 객체 스트림을 통하여productList의 상품정보를 출력합니다.
        productList.stream().forEach(System.out::println);
    }
}








//List<Product> productList = new ArrayList<>();
//        Random random = new Random();
//
//        for (int i = 1; i <=10; i++) {
//            productList.add(new Product(i,"라면땅"+i, "shinsegae", random.nextInt(10000)));
//        }
//
//        //2. 객체 스트림을 통하여productList의 상품정보를 출력합니다.
//        productList.stream().forEach(System.out::println);