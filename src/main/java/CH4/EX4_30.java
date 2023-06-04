package CH4;

public class EX4_30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }
        // break문이 수행되면 ++i, sum+=i;가 실행되지 않고 while문을 완전히 벗어난다

        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}
