package CH2;

public class EX2_2 {
    public static void main(String[] args) {
        int x = 10, y = 20; //정수형 변수 x의 값은 10, y의 값은 20
        int tmp = 0; // 정수형 변수 tmp의 값이 0

        System.out.println("x:" + x + "y:" + y);

        tmp = x; // x와 y의 값을 바꿀 때 x = y 라고 선언할 수 없음
        x = y; //그래서 변수 tmp를 사용해 내용을 바꾸는 것임
        y = tmp; // 오렌지 주스랑 딸기 주스를 담은 각 컵을 바꾸기 위해 컵 하나를 더 사용해서 바꾸는 것과 같은 개념

        System.out.println("x:" + x + "y:" + y);
    }
}
