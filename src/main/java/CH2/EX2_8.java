package CH2;

public class EX2_8 {
    public static void main(String[] args) {
        String a = "\'\'\'";
        System.out.println('\''); // '''처럼 할수 없다 '''은 문자열에 저장해서 출력해야함
        System.out.println(a);
        System.out.println("abc\t123\b456"); // \b(backspace)에 의해 3이 지워짐
        System.out.println('\n');
        System.out.println("\"Hello\""); // 큰따음표 출력방법
        System.out.println("c:\\");
    }
}
