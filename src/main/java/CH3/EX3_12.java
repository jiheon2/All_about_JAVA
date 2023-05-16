package CH3;

public class EX3_12 {
    public static void main(String[] args) {
        char c1 = 'a'; // c1에는 문자 'a'의 코드값인 97이 저장됨
        char c2 = c1; // c1에 저장된 값이 c2에 저장됨
        char c3 = ' '; // c3을 공백으로 초기화

        int i = c1 + 1; // 'a' + 1 > 97 + 1 = 98

        c3 = (char)(c1 + 1); // c1 + 1의 연산결과가 int형이므로 char c3에 담기 위해서는 char형으로 형변환이 필요함
        c2++;
        c2++;

        System.out.println("i=" + i);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }
}
