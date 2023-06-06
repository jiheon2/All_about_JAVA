package CH5;

import java.util.Scanner;

public class EX5_20 { // 좌표를 불러 상대방의 배의 위치를 알아내는 게임
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0},
        };

        for(int i=1; i<SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }
        /*
        board[i][0]에 i+'O'(i에 아스키코드'O'의 값을 더함)을 대입함
        board[x][y] y가 행 x가 열
        행과 열의 첫번째 값에 i + 'O'가 들어감
        결과 후 2차원 배열 형태
            0 1 2 3
            1
            2
            3
         */
        Scanner s = new Scanner(System.in);

        while(true) { // 무한 반복문
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input = s.nextLine();

            if(input.length()==2) { // 2개의 글자를 입력한 경우
                x = input.charAt(0) - '0'; // 문자를 숫자로 변환
                y = input.charAt(1) - '0';

                if(x==0 && y==0) {
                    break; // 00을 입력한 경우 while문 종료
                }
            }
            if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            /* || : or > 입력받은 글자가 2개가 아니거나, x가 0보다 작거나 같거나, SIZE보다 크거나 같을 때
            즉 위의 for문 실행 후 2차원 배열의 범위 바깥의 값을 입력한 경우에는 다시 입력받게 하는 코드
            */

            board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
            /*
             조건부 연산자 ? : 를 사용함
             shipBoard[x-1][y-1]의 값이 1이면, 'O'를 board[x][y]에 저장하는 코드
             반대로 1이 아니면 X를 저장함
             */

            for(int i=0; i<SIZE; i++) {
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
