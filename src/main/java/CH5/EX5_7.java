package CH5;

public class EX5_7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<100; i++) {
            int n = (int)(Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
            // numArr[0]과 numArr[n]의 값을 바꾸는 코드
            // 오른쪽에서 왼쪽으로 값을 넣어줌
        }

        for(int i = 0; i<numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
