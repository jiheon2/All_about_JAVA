package CH3;

public class EX3_11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d\n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);
        System.out.printf("'%c'=%d\n", a, (int)a);
        System.out.printf("'%c'=%d\n", d, (int)d);
        System.out.printf("'%c'=%d\n", zero, (int)zero);
        System.out.printf("'%c'=%d\n", two, (int)two);
        // 문자는 유니코드로 변환되어 저장되므로 문자간의 사칙연산은 정수간의 연산과 동일
    }
}
