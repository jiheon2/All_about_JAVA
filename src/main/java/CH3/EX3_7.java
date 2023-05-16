package CH3;

public class EX3_7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b); // int 30 * 10 = 300 >> int 300 = byte 44 값손실 발생
        System.out.println(c);
    }
}
