package CH3;

public class EX3_21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b\n", 10==10.f); // 10.0f == 10.0f true
        System.out.printf("'0'==0 \t %b\n", '0'==0); //'0'의 유니코드는 48 > 48 == 0 false
        System.out.printf("'A'==65 \t %b\n", 'A'==65); // 'A'의 유니코드는 65 > 65 == 65 true
        System.out.printf("'A' > 'B' \t %b\n", 'A' > 'B'); // 'A' = 65 'B'=66 false
        System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B'); // 'A'+1 = 66 'B'=66 != 아니다가 아니라 ==같다
    }
}
