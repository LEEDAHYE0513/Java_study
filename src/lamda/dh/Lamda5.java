package lamda.dh;

@FunctionalInterface
interface Operator{
    public int apply(int x, int y);
}
public class Lamda5 {
    public static int[] scores = {10,50,3};

    public static int maxOrMin(Operator operator){
        int result = scores[0];
        for (int score : scores){
            result = operator.apply(result,score);
        }
        return result;
    }
    public static void main(String[] args) {
        Operator maxOper = (x,y) -> x > y ? x:y;
        Operator minOper = (x,y) -> x > y ? x:y;

//        int max = maxOrMin(maxOper);
//        int max=  maxOrMin(x,y)-> Math.max((x,y));
//        int max = maxOrMin(Math::max);

        int max = maxOrMin(maxOper);
        System.out.println("최댓값: " + max);

//        int min = maxOrMin(minOper);
//        int min=  maxOrMin(x,y)-> Math.min((x,y));
//        int min = maxOrMin(Math::min);

        int min = maxOrMin(minOper);
        System.out.println("최솟값 : "+ min);
    }

}
