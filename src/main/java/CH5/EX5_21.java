package CH5;

import java.util.Scanner;

public class EX5_21 { //빙고게임
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner s = new Scanner(System.in);

        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                bingo[i][j] = i*SIZE + j + 1;
            }
        }
        /*
         j를 SIZE-1까지 반복 > j가 2차원배열의 열을 나타냄
         i*SIZE + j + 1을 bingo[i][j]배열에 할당 > +1을 하는 이유는 bingo[0][0] = 0이기 때문에 0을 제외하고 1~25를 나타내기 위해서임

         이 코드의 결과를 2차원 배열로 나타내면
         {
         {1, 2, 3, 4, 5},
         {6, 7, 8, 9, 10},
         {11, 12, 13, 14, 15}
         {16, 17, 18, 19, 20}
         {21, 22, 23, 24, 25
         };
         */

        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                x = (int)(Math.random()*SIZE); // Math.random()의 범위는 0<=Math.random()<1
                y = (int)(Math.random()*SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
                // bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
            }
        }
        // 배열에 저장된 값을 뒤섞는 코드 (shuffle)


        do { // 최소한 한번은 무조건 실행하는 do ~while 구문
            for(int i=0; i<SIZE; i++) {
                for(int j=0; j<SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            // 빙고판을 출력하는 코드
            // 5X5의 빙고판이 뒤섞인 다음 랜덤한 값으로 만들어짐

            System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
            String tmp = s.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
            num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환
            // 빙고판에서 지울 숫자를 입력하는 코드

            outer:
            for(int i=0; i<SIZE; i++) {
                for(int j=0; j<SIZE; j++) {
                    if(bingo[i][j]==num) {
                        bingo[i][j] = 0; // 입력한 숫자와 빙고판의 숫자가 같을 경우 0으로 만듬
                        break outer; //2중 반복문을 벗어남.
                    }
                }
            }
        } while(num!=0);
        // 입력한 숫자가 0과 다를 경우 종료
    }
}
