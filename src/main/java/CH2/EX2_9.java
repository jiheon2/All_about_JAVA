package CH2;

public class EX2_9 {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);
        // sMin-1 = sMax 최소값 -1 = 최댓값
        // sMax+1 = sMin 최댓값 +1 = 최솟값
        // cMin-1 = cMax
        // cMax+1 = cMin
        // 부호있는 정수는 부호비트가 0에서 1이 될 때 오버플로우
        // 부호비트는 비트 4자리 중에 첫번째 자릿 수 0은 양수 1은 음수
        // ex) 0111 (7) -> 1000 (-8)
        // 오버플로우 : 타입이 표현할 수 있는 값의 범위를 넘어서는 것
    }
}
