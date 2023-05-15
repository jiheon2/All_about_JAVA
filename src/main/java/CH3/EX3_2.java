package CH3;

public class EX3_2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++; // j=i 먼저 실행 후 i++
        System.out.println("j=i++; 실행 후, i=" + i +", j=" + j);

        i=5; // 값 초기화
        j=0; // 값 초기화

        j = ++i; // ++i먼저 실행 후 j=i
        System.out.println("j=++i; 실행 후, i=" + i +", j=" + j);
    }
}
