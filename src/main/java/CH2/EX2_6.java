package CH2;

import java.util.Scanner;

public class EX2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 클래스를 객체화 한 것이 scanner

        System.out.printf("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        // String 클래스를 객체화 한것이 input, Scanner클래스의 nextLine함수를 input을 통해 사용함
        int num = Integer.parseInt(input);
        // Integer.parseInt는 입력받은 문자열을 int타입 값으로 변환 / 숫자가 아닌 문자 또는 기호, 공백을 입력하면 에러 발생
        // float 타입 값으로 변환하려면 Float.parseFloat()을 사용해야함.
        System.out.println("입력내용 :" +input);
        System.out.printf("num=%d\n", num);
    }
}
