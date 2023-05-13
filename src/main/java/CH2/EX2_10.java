package CH2;

public class EX2_10 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.12345678901234567890f;
        double d = 9.12345678901234567890f;
        System.out.printf("       123456789012345678901234\n");
        System.out.printf("f : %f\n", f); // 소수점 6번째 자리까지만 출력됨
        System.out.printf("f : %24.20f\n", f); // 전체 24자리 중 20자리는 소수점 이하의 수를 출력
        System.out.printf("f : %24.20f\n", f2);
        System.out.printf("d : %24.20f\n", d);
        // float : 연산속도의 향상, 메모리를 절약 할 때 사용
        // double : 더 큰 값의 범위거나 더 높은 정밀도를 필요
        // 실수형에서의 오버플로우 = 무한대
        // 실수형에서의 언더플로우 = 0
        // 실수형의 저장방식
        // 부동소수점수 : ±M X 2ª(2의 a제곱)
        // 부호(Sign bit) : 0이면 양수, 1이면 음수
        // 지수(Exponenet) : 부호있는 정수
        // 가수(Mantissa) : 실제 값을 저장하는 부분
    }
}
