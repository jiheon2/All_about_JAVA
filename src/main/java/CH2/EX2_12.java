package CH2;

public class EX2_12 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d; // 형변환 연산자 : 괄호()

        System.out.println("score="+score);
        System.out.println("d="+d);
        // 형변환(캐스팅)은 실제 값을 변화시키지 않음
        // 기본 데이터 타입에서 boolean을 제외하고 형변환 가능
        // 기본 타입과 참조 타입은 형변환 불가능
    }
}
