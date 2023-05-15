package CH3;

public class EX3_4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // 양수 표시 쓸일 없음
        System.out.println(i);

        i = -10;
        i = -i; // - 부호연산자는 양수는 음수, 음수는 양수로 변경하여 반환
        System.out.println(i);
    }
}
