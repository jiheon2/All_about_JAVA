package CH2;

public class EX2_14 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f =%20.18f\n", f);
        System.out.printf("d =%20.18f\n", d);
        System.out.printf("d2=%20.18f\n", d2);
        // 실수형도 작은 값에서 큰 값으로 변환하는 경우, 빈공간을 0으로 채움
        // 변환할 때 지수(E)에 기저를 더해서 변환하고, 가수(M)는 남은자리를 0으로 채움
        // 반대인 경우 기저를 큰타입의 기저를 빼고 작은 타입의 기저를 더한 뒤 가수는 23자리만 저장(float범위)
        // 형변환 할 때 가수의 24번째 자리에서 반올림이 발생할 수 있따는 것(24번째 값이 1일 경우)
        // 같은 값을 저장해도 float과 double의 정밀도 차이로 인해 서로 다른 값이 저장됨
    }
}
