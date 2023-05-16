package CH3;

public class EX3_17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0; // 0.5를 더해서 반올림을 함
        System.out.println(shortPi);
    }
}
