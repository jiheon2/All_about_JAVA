package CH2;

public class EX2_7 {
    public static void main(String[] args) {
        char ch = 'A'; // char ch = 65;랑 같은 표현
        int code = (int)ch;

        System.out.printf("%c=%d(%X) \n", ch, code, code);

        char hch = '가'; // char hch = 0xAC00;(16진수)
        System.out.printf("%c=%d(%X) \n", hch, (int)hch, (int)hch);
    }
}
