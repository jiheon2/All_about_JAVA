package CH3;

public class EX3_8 {
    public static void main(String[] args) {
        int a = 1_000_000; // 1,000,000
        int b = 2_000_000; // 2,000,000

        long c = a * b; // a * b = 2,000,000,000,000 ?

        System.out.println(c);
        // 실행결과는 -1454759936임 int형으로 계산을 하고 long에 담는 것이기 떄문에
        // a * b 는 이미 int값으로 계산하여 범위를 넘는 값을 가지고 있으므로 다른 값이 나옴
        // 정확한 결과를 위해서는 long타입으로 형변환을 해줘야 함 (long)a*b or long a,b
    }
}
