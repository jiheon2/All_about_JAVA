package CH3;

public class EX3_6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a+b); // int형보다 작은 byte형의 연산인데 연산결과가 int형임 > int형(4byte)의 값을 byte(1byte)
                              // 에 저장하려 했기 떄문에 오류가 남 > 그래서 형변환을 해줘야함 (byte)(a+b)
        System.out.println(c);
    }
}
