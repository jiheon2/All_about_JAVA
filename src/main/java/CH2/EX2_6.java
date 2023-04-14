package CH2;

import java.util.Scanner;

public class EX2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 클래스를 객체화 한 것이 scanner

        System.out.printf("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        // String 클래스를 인스턴트화 한 것이 input이고 input이 Scanner 클래스의 nextline()함수를 scanner를 통해 사용하는 것으로 선언
    }
}
