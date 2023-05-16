package CH3;

public class EX3_10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a; // int * int의 값이 int데이터타입의 범위를 넘어서 오버플로우 발생
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
    }
}
