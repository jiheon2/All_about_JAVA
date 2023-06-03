package CH4;

import java.util.Scanner;

public class EX4_27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner s = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

        while(flag) {
            System.out.print(">>");

            String tmp = s.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0) {
                sum += num;
            } else {
                flag = false;
            } // num 0이면 flag가 false가 됨으로 while문이 종료됨
        }
        System.out.println("합계:"+sum);
    }
}
