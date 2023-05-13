package CH2;

public class EX2_11 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f); // float타입의 값을 int타입의 값으로 해석해서 반환하는 Float클래스의 함수

        System.out.printf("%f\n", f);
        System.out.printf("%X\n", i); //16진수 출력
        // 정규화 : 2진수로 변환된 실수를 저장할 때 '1.xxx X 2ª'의 형태로 변환하는 과정
        // 지수는 기저법으로 저장됨 / 기저법은 특정값(기저)를 더하고 저장한뒤 읽어올 때는 다시 뻄
        // 부동소수점의 오차가 발생할 수 있음
    }
}
