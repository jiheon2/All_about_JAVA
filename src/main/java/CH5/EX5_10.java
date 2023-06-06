package CH5;

public class EX5_10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        for(int i=0; i<numArr.length-1; i++) { // length-1을 쓰는 이유는 마지막 결과는 정렬이 완료된 상태이기 때문임
            boolean changed = false; // 자리바꿈이 생겼는지 체크

            for(int j=0; j<numArr.length-1-i; j++) { // -i를 하는 이유는 i for문을 할 경우에 제일 큰수가 제일 뒤로 정렬되기 때문
                if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꿈
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true; // 자리바꿈이 생기면 true로 바꿔줌
                }
            }

            if(!changed) break; // 자리바꿈이 생기지 않을 경우 반복문을 벗어남
            for(int k=0; k<numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
// 버블정렬 알고리즘 문제
