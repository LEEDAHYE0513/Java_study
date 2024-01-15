package collection.app;

public class Car implements Comparable<Car>{ //Car 클래스 기준으로 정렬하겠다

    private String car;
    private int price;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String car, int price) {
        this.car = car;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        int comparePrice = o.getPrice();
//        return comparePrice - this.price; // 내림차순(음수)
        return this.price - comparePrice; //오름차순(양수)
    }
}