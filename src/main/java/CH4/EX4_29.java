package CH4;

public class EX4_29 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++) {
            System.out.printf("i=%d", i);

            int tmp = i;

            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) { // tmp%10이 3의 배수인지 확인하는 조건문, 0은 제외함
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);
            // tmp /= 10은 tmp = tmp / 10과 동일 / 초기화를 해줌
            System.out.println();
        }
    }
}

