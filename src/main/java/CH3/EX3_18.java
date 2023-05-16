package CH3;

public class EX3_18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; // Math.round() 메서드는 소수점 첫째자리에서 반올림을 하고 정수로 반환함
        System.out.println(shortPi);
    }
}
