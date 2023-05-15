package CH2;

public class EX2_13 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d\n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d\n", b, i);

        System.out.println("i="+Integer.toBinaryString(i));
        // int타입(큰) 값을 byte타입(작은) 값으로 변환하는 경우 값손실 발생할 수 있음
        // 작은타입 값을 큰타입으로 변환 하는 경우 빈공간을 0 또는 1로 채움(음수는 1)
        // Integer.toBinaryString()라는 메서드는 10진 정수를 2진정수로 변환한 문자열을 알려주는 메서드
    }
}
