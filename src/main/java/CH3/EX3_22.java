package CH3;

public class EX3_22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0==10.0f %b\n", 10.0==10.0f); // true
        System.out.printf("0.1==0.1f %b\n", 0.1==0.1f); // false 이유는 실수형은 근사값으로 저장되기 때문에 오차가 발생할 수 있음
        System.out.printf("f=%19.17f\n", f);
        System.out.printf("d=%19.17f\n", d);
        System.out.printf("d2=%19.17f\n", d2);
        System.out.printf("d==f %b\n", d==f); // false
        System.out.printf("d==d2 %b\n", d==d2); // false
        System.out.printf("d2==f %b\n", d2==f); // true
        System.out.printf("(float)d==f %b\n", (float)d==f); // true
        // float과 double을 비교하는 방법은 double을 float으로 형변한 한 뒤 비교해야 함
        // 실수는 저장할 때 2진수로 변환하는 과정에서 오차가 발생 > 정밀도가 더 높은 double타입으로 형변환해도 오차가 적어지지 않음
    }
}
