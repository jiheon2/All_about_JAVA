package CH4;

import java.util.Scanner;

public class EX4_2 {
    public static void main(String[] args) {
        int input;

        System.out.printf("숫자를 하나 입력하세요.>");

        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        input = Integer.parseInt(tmp);

        if(input==0) {
            System.out.println("입력하신 숫자는 0입니다");
        }

        if(input!=0)
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        System.out.printf("입력하신 숫자는 %d입니다", input);
        // if문에 {}를 사용하지 않을 경우는 한문장만을 사용할 때 {}를 사용하지 않을 수 있음
        // printf문은 if문과 상관없이 출력됨
    }
}
