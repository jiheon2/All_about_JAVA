package CH3;

public class EX3_16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f; // 반올림을 하지 않고 버림
        System.out.println(shortPi);
    }
}
